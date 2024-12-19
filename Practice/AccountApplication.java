import java.util.Scanner;

public class AccountApplication {
  public static void main (String... args) {
  Scanner input = new Scanner(System.in);
  Account newAccount = new Account();
  Account newAccount2 = new Account();
  runAccountOperations(newAccount);
  System.out.println();
  runAccountOperations(newAccount2);
  
  System.out.print("How much would you like to transfer from your account? >>  ");
  double transferAmount = input.nextDouble();
   
  System.out.print("\nEnter your account number >> ");
  long accountNumber = input.nextLong();
  
  System.out.print("\nEnter your PIN >> ");
  String pin = input.next();
  
  System.out.print("\nEnter destination account number >> ");
  long destinationAccountNumber = input.nextLong();
  
  newAccount.transfer(accountNumber, destinationAccountNumber, transferAmount, pin);
  double newAccount2Balance = newAccount2.getBalance() + transferAmount;
  
  System.out.println("\nAccount name : " + newAccount.getName() + "\nAccount number : " + newAccount.getAccountNumber() + "\nAccount Balance : #" + newAccount.getBalance() + "\n\nAccount name : " + newAccount2.getName() + "\nAccount number : " + newAccount2.getAccountNumber() + "\nAccount Balance : #" + newAccount2Balance  );
  }
  
  public static void runAccountOperations(Account account) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter preferred name on account >>  ");
  String accountName = input.nextLine();
  account.setName(accountName);
  account.setAccountNumber();
  System.out.println("\nYour account number is " + account.getAccountNumber());

  System.out.print("\nEnter your preferred 4-digit PIN >> ");
  String pin = input.next();
  account.setPin(pin);
  
  System.out.println();
  System.out.print("Enter your initial deposit >>  ");
  double initialDeposit = input.nextDouble();
  
  System.out.print("\nEnter your account number >> ");
  long accountNumber = input.nextLong();
  
  System.out.print("Enter your 4-digit pin >> ");
  String newPin = input.next();
  
  account.deposit(accountNumber, initialDeposit, newPin);
  

  System.out.println();
  System.out.print("How much would you like to withdraw from your current balance?   ");
  double withdrawalAmount = input.nextDouble();
    
  System.out.print("Enter your 4-digit pin >> ");
  newPin = input.next();
  account.withdraw(accountNumber, withdrawalAmount, newPin);
  
  System.out.println();
  
 
  }
}
