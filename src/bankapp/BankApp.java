package bankapp;
import java.util.Scanner;

public class BankApp {
    static Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);
    static String boldText = "\033[1m";
    static String normalText = "\033[0m";

    public static void main(String[] args) {
        String title = boldText + "Welcome to " + bank.bankName() + normalText;
        System.out.println(title);
        menu();
    }

    public static void menu() {

        String options = """
                
                1. Open Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Update pin
                7. Close Account
                8. Exit
                """;

        System.out.println(options);
        int option = input.nextInt();

        switch (option) {
            case 1:
                createAccount();
                menu();
                break;
            case 2:
                deposit();
                menu();
                break;
            case 3:
                withdraw();
                menu();
                break;
            case 4:
                transfer();
                menu();
                break;
            case 5:
                checkBalance();
                menu();
                break;
            case 6:
                updatePin();
                menu();
                break;

            case 7:
                closeAccount();
                menu();
                break;

            case 8:
                exit();
                break;
        }

    }

    public static void createAccount() {
        System.out.print("Enter first name >> ");
        String firstName = input.next();

        System.out.print("Enter last name >> ");
        String lastName = input.next();

        System.out.print("Enter 4-digit pin >> ");
        String pin = input.next();

        System.out.print("Enter your bvn >> ");
        String bvn = input.next();

        try {
            bank.createAccount(firstName, lastName, pin, bvn);

            String accountDetails = "\nAccount name: " + bank.getAccountName(pin) + "\nAccount number: " + bank.getAccountNumber(bank.getAccountName(pin), pin);
            System.out.println("Account successfully created" + accountDetails);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            createAccount();
        }
    }

    private static void deposit() {

        System.out.print("Account number >> ");
        long accountNumber = input.nextLong();


        System.out.print("\nDeposit amount >> ");
        double depositAmount = input.nextDouble();

        try {
            bank.deposit(accountNumber, depositAmount);
            System.out.println("Deposit successful!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            deposit();
        }

    }

    private static void withdraw() {

        System.out.print("Account number >> ");
        long accountNumber = input.nextLong();


        System.out.print("\nWithdraw amount >> ");
        double withdrawAmount = input.nextDouble();

        System.out.print("4-digit Pin >> ");
        String pin = input.next();

        try {
            bank.withdraw(accountNumber, withdrawAmount, pin);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            withdraw();
        }

    }


    private static void checkBalance() {
        System.out.print("Account number >> ");
        long accountNumber = input.nextLong();

        System.out.print("4-digit Pin >> ");
        String pin = input.next();

        try {
            double balance = bank.checkBalance(accountNumber, pin);
            System.out.println("Dear " + bank.getAccountName(pin) + ", you have a balance of #" + String.format("%,.2f", balance));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            checkBalance();
        }
    }

//    private static void validateInputFor(String input) {
//        String patternString = "^[A-za-z]+$";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(input);
//
//        if (!matcher.matches()) throw new InputMismatchException("Invalid input!");
//    }
//
//    private static void validateInputFor(long input) {
//        String patternString = "^[0-9]+$";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(String.valueOf(input));
//
//        if (!matcher.matches()) throw new InputMismatchException("Invalid input!");
//    }
    private static void transfer() {
        System.out.print("Your account number >> ");
        long senderAccountNumber = input.nextLong();

        System.out.print("Destination account number >> ");
        long receiverAccountNumber = input.nextLong();

        System.out.print("Transfer amount >> ");
        double transferAmount = input.nextDouble();

        try {
            validateReceiverAccountDetails(receiverAccountNumber);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            transfer();
        }

        System.out.print("Your 4-digit pin >> ");
        String pin = input.next();

        try {
            bank.transfer(senderAccountNumber, receiverAccountNumber, transferAmount, pin);
            System.out.println("Transfer successful!");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
            transfer();
        }
    }

    private static void updatePin() {
        System.out.print("Your account number >> ");
        long accountNumber = input.nextLong();

        System.out.print("Old pin >> ");
        String oldPin = input.next();

        System.out.print("New pin >> ");
        String newPin = input.next();

        try {
            bank.updatePin(accountNumber, oldPin, newPin);
            System.out.println("Pin changed successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Operation suspended. Please try again later.");
            System.exit(0);
        }

    }

    private static void closeAccount() {
        System.out.print("Are you sure you want to close your account? (y/n)");
        String answer = input.next();
        switch (answer) {
            case "y":
                System.out.print("Your account number >> ");
                long accountNumber = input.nextLong();

                System.out.print("Your pin >> ");
                String pin = input.next();

                String accountName = bank.getAccountName(pin);

                try {
                    bank.closeAccount(accountName, pin);
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
                case "n":

                    exit();
                    break;
                    default: System.out.println("Invalid selection");
                    closeAccount();
                    break;

        }
    }

    private static void validateReceiverAccountDetails(long receiverAccountNumber) {
        try {
            String receiverDetails = bank.findAccountBy(receiverAccountNumber).getAccountName();
            System.out.print("Are you sure you want to transfer to " + receiverDetails + "? (Yes/No) >> ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("Yes")) throw new IllegalArgumentException();
        }
        catch (RuntimeException e) {
            String errorMessage = "Destination Account Not Found!";
            System.out.println(errorMessage);
            exit();
        }

    }

    private static void exit() {
        System.out.println("Thanks for using SCABank, bye!");
        System.exit(0);
    }
}


