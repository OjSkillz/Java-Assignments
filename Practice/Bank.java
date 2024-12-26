import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

  private String name = "Loci Bank";
  private String regNumber;
  private List<Account> accounts = new ArrayList<Account>();
  
   Scanner input = new Scanner(System.in);
   
   public void createAccount (String accountName, String bvn, String pin) {
   
   int trials = 4;

   
    Account newAccount = new Account();
    
    newAccount.setName(accountName);
    
    newAccount.setBvn(bvn);
    
    newAccount.setPin(pin);
    
     while (newAccount.getPin() == null) {
     System.out.print("\nEnter your preferred 4-digit pin (" + trials + " trials left) >> ");
     pin = input.next();
     newAccount.setPin(pin);
     trials--;
     if (trials == 0 ) {
     System.out.println("\nYou have exceeded the amount of trials at this time! Please try again later.");
     return;
     }
     }  
  
    newAccount.setAccountNumber();
    accounts.add(newAccount);
    
    System.out.println("\nYour Account has been created successfully. Here are your account details >>");
    displayAccountDetails(accountName);
   
   }
   
   public void deposit(long accountNumber, double depositAmount) {
    int match = 0;
      for (Account account : accounts) {
        if (account.getAccountNumber() == accountNumber && depositAmount > 0.00 ) {
          account.deposit(depositAmount);
          System.out.println("Success!");
          match++;
         } 
        } if (match == 0) System.out.println("Invalid Account Number!");
    }
   
   public void withdraw(long accountNumber, double withdrawalAmount, String newPin) {
   int match = 0;
      for (Account account : accounts) {
        if (account.getPin().equals(newPin) && account.getAccountNumber() == accountNumber && withdrawalAmount > 0.00 ) {
        account.withdraw(withdrawalAmount);
        System.out.println("Success!");
        match++;
        }
        }  if (match == 0) System.out.println("Invalid PIN or Account Number!");
    } 
   
   public void transfer(long sourceAccountNumber, long destinationAccountNumber, double transferAmount, String pin) {
      int matchSender = 0, matchReceiver = 0;
      for (Account account : accounts) {
      if (account.getPin().equals(pin) && account.getAccountNumber() == sourceAccountNumber && transferAmount > 0.00 ) {
        double sourceBalance = account.getBalance();
        sourceBalance -= transferAmount;
        account.updateBalance(sourceBalance);
        System.out.println("Success!");
        matchSender++;
      }
      
      if (account.getAccountNumber() == destinationAccountNumber) {
        double destinationBalance = account.getBalance();
        destinationBalance += transferAmount;
        account.updateBalance(destinationBalance);
        matchReceiver++;
      }
      } if (matchSender == 0) System.out.println("Invalid Account Number or PIN Entered!");
        if (matchReceiver == 0) System.out.println("Destination Account Not Found!");
  }
  
    public void displayAccountBalance(long accountNumber, String pin) {
      int match = 0;
      for (Account account : accounts) {
        if (account.getAccountNumber() == accountNumber && account.getPin().equals(pin)) {
          System.out.printf("%nDear %s, your current balance is #%.2f %n", account.getName() , account.getBalance());
          match++;
        }
      } if (match == 0) System.out.println("Invalid PIN or Account Number!");
  }
  
  public void closeAccount(double accountNumber, String pin) {
    for (Account account : accounts) {
      if (account.getAccountNumber() == accountNumber && account.getPin().equals(pin)) {
        System.out.printf(""" 
          %nDear %s, are you sure you want to close this account?%n 
          1️⃣  Yes
          2️⃣  No
          >>    """, account.getName());
          int authorization = input.nextInt();
          input.nextLine();
          
          switch (authorization) {
          
          case 1: accounts.remove(account);
          System.out.println("\nAccount closed!");
          return;
               
          case 2: break;
          } 
      }
      else System.out.println("Invalid Account Number or PIN detected! Try again later");     
    }
  }
  
    public void displayAccountDetails(String accountName) {
      for (Account account : accounts) {
        if (account.getName() == accountName) 
          System.out.println("\nAccount name : " + account.getName() + "\nAccount number : " + account.getAccountNumber());
        }
    }
            
  
  
  public String getName(){
  return name;
  }
}
