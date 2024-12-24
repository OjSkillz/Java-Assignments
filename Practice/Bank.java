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
   
   public void deposit(long accountNumber, double depositAmount, String newPin) {
   for (Account account : accounts) {
      if (account.getPin().equals(newPin) && account.getAccountNumber() == accountNumber && depositAmount > 0.00 ) 
        account.deposit(accountNumber, depositAmount, newPin);
    }
   } 
   public void withdraw(long accountNumber, double withdrawalAmount, String newPin) {
      for (Account account : accounts) {
      if (account.getPin().equals(newPin) && account.getAccountNumber() == accountNumber && withdrawalAmount > 0.00 ) 
        account.withdraw(accountNumber, withdrawalAmount, newPin);
    }
   }
   
   public void transfer(long sourceAccountNumber, long destinationAccountNumber, double transferAmount, String pin) {
      for (Account account : accounts) {
      if (account.getPin().equals(pin) && account.getAccountNumber() == sourceAccountNumber && transferAmount > 0.00 ) {
      double sourceBalance = account.getBalance();
     sourceBalance -= transferAmount;
      }
      if (account.getAccountNumber() == destinationAccountNumber) {
      double destinationBalance = account.getBalance();
      destinationBalance += transferAmount;
      }
      }
    }
    public void displayAccountDetails() {
      for (Account account : accounts) {
          System.out.println("\nAccount name : " + account.getName() + "\nAccount number : " + account.getAccountNumber() +     "\nAccount Balance : #" + account.getBalance());
           System.out.println();
          }
        }
      
        public void displayAccountDetails(String accountName) {
    for (Account account : accounts) {
    if (account.getName() == accountName) 
     System.out.println("\nAccount name : " + account.getName() + "\nAccount number : " + account.getAccountNumber() +     "\nAccount Balance : #" + account.getBalance());
    }
    }
    public void displayAccountBalance(long accountNumber) {
    for (Account account : accounts) {
    if (account.getAccountNumber() == accountNumber) 
     System.out.printf("%nDear %s, your account has been updated and your current balance is #%.2f %n", account.getName() ,
    account.getBalance());
    }
    }
  
    public String getName(){
    return name;
    }
}
