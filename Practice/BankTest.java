import java.util.Scanner;

public class BankTest {
static Bank bank =  new Bank();
  public static void main(String... args) {
 
  System.out.println("\nWelcome to " + bank.getName() + ", what would you like to do? "); 
  mainMenu();
  }
 
public static void mainMenu() {

  Scanner input = new Scanner(System.in);
  System.out.print(""" 
              
                1️⃣  Open new account
                2️⃣  Deposit
                3️⃣  Withdraw
                4️⃣  Transfer
                5️⃣  Check Account Balance
                6️⃣  Close Account
                7️⃣  Exit
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
  bank.displayAccountDetails(accountName);

  displayReturnPrompt();
  break;

  case 2:  
   System.out.print("\nEnter your account number >>  ");
   long accountNumber = input.nextLong();

  System.out.print("\nEnter deposit amount >>   ");
   double depositAmount = input.nextDouble();
   
  bank.deposit(accountNumber, depositAmount);

  displayReturnPrompt();
  break;
  
  case 3: 
    System.out.print("\nEnter your account number >>  ");
    accountNumber = input.nextLong();

    System.out.print("\nEnter withdrawal amount >>   ");
    double withdrawalAmount = input.nextDouble();
  
    System.out.print("\nEnter your 4-digit pin >>  ");
    pin = input.next();
 
    bank.withdraw(accountNumber, withdrawalAmount, pin);
 
    displayReturnPrompt();
    break;
  
  case 4 : 
    System.out.print("\nEnter your account number >>  ");
    accountNumber = input.nextLong();
    
    System.out.print("\nEnter destination account number >>  ");
    long destinationAccountNumber = input.nextLong();
    
    System.out.print("\nEnter amount to transfer >>   ");
    double transferAmount = input.nextDouble();
    
    System.out.print("\nEnter your 4-digit pin >>  ");
    pin = input.next();
    input.nextLine();
    
    bank.transfer(accountNumber, destinationAccountNumber, transferAmount, pin);
    
    displayReturnPrompt();
    break;
  
  case 5 :  
    System.out.print("\nEnter your account number >>  ");
    accountNumber = input.nextLong();
   
    System.out.print("\nEnter your 4-digit pin >>  ");
    pin = input.next();
  
    bank.displayAccountBalance(accountNumber, pin);
   
    displayReturnPrompt();
    break;
  // case 6 :
  // break;
  
  case 7: break;
  
  default : {
  System.out.println("\nInvalid selection. Try again");
  mainMenu();
  }
  }
  }

  public static void  displayReturnPrompt() {
  Scanner input = new Scanner(System.in);
  System.out.println();
    System.out.print(""" 
             1️⃣  Return to main menu
             2️⃣  Exit
             >>>   """);
    int response = input.nextInt();
    input.nextLine();
  
    switch (response) {
    
    case 1: mainMenu();
    break;
  
    case 2: break;
       
    default : {
    System.out.println("\nInvalid selection. Try again");
    displayReturnPrompt();
    }
    }
  }
  
}
