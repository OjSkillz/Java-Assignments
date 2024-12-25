import java.util.ArrayList;
import java.util.List;
public class Bank {

  private String name = "Loci Bank";
  private String regNumber;
  private List<Account> accounts = new ArrayList<Account>();
  
   public void createAccount (String accountName, String bvn, String pin) {
    Account newAccount = new Account();
    newAccount.setName(accountName);
    newAccount.setBvn(bvn);
    newAccount.setPin(pin);
    newAccount.setAccountNumber();
    accounts.add(newAccount);
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
  
    public void displayAccountDetails(String accountName) {
      for (Account account : accounts) {
        if (account.getName() == accountName) 
          System.out.println("\nAccount name : " + account.getName() + "\nAccount number : " + account.getAccountNumber());
        }
    }
            
    public void displayAccountBalance(long accountNumber, String pin) {
      for (Account account : accounts) {
        if (account.getAccountNumber() == accountNumber && account.getPin().equals(pin)) {
          System.out.printf("%nDear %s, your current balance is #%.2f %n", account.getName() , account.getBalance());
        }
      }
  }
  
  public String getName(){
  return name;
  }
}
