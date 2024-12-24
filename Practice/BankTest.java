import java.util.Scanner;

public class BankTest {

  public static void main(String... args) {
 
  mainMenu();
  }
public static void mainMenu() {
 Bank bank = new Bank();
  Scanner input = new Scanner(System.in);
  
System.out.println("Welcome to " + bank.getName() + ", what would you like to do? ");
System.out.print("""
                1️⃣  Open new account
                2️⃣  Deposit
                3️⃣  Withdraw
                4️⃣  Transfer
                5️⃣  Close Account
                >>>    """);           
    int userResponse = input.nextInt();
    input.nextLine();
  
switch (userResponse) {
case 1: 
  System.out.print("\nEnter your account name >>  ");
  String accountName = input.nextLine();

  System.out.print("\nEnter your BVN >>   ");
  String bvn = input.next();
  
  System.out.print("\nEnter your preferred 4-digit pin >>  ");
  String pin = input.next();

  bank.createAccount(accountName, bvn, pin);
  
  System.out.println("\nYour Account has been created successfully. Here are your account details >>");
  bank.displayAccountDetails();
  
  System.out.print(""" 
             1️⃣  Return to main menu
             2️⃣  Exit
             >>>
                          """);
  int response = input.nextInt();
  input.nextLine();
  switch (response) {
  case 1: mainMenu();
  break;
  
  case 2: break;
  }
  break;

  case 2:  
   System.out.print("\nEnter your account number >>  ");
  long accountNumber = input.nextLong();

  System.out.print("\nEnter deposit amount >>   ");
  double depositAmount = input.nextDouble();
  
  System.out.print("\nEnter your 4-digit pin >>  ");
  pin = input.next();
  bank.deposit(accountNumber, depositAmount, pin);
  bank.displayAccountDetails();
  bank.displayAccountBalance();
  break;
  }
}

}
