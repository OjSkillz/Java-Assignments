import java.util.ArrayList;
import java.util.List;
public class Bank {

  private String name = "Loci Bank";
  private String regNumber;
  private List<Account> accounts = new ArrayList<Account>();
  Account newAccount = new Account();;
   public void createAccount (String accountName, String bvn, String pin) {
   
    newAccount.setName(accountName);
    newAccount.setBvn(bvn);
    newAccount.setPin(pin);
    newAccount.setAccountNumber();
    accounts.add(newAccount);
   }
   
   public void deposit(long accountNumber, double depositAmount, String newPin) {
   for (Account account : accounts) {
      if (account.getPin().equals(newPin) && account.getAccountNumber() == accountNumber && depositAmount > 0.00 ) {
        account.deposit(accountNumber, depositAmount, newPin);
      }
    }
   } 
   public void withdraw(long accountNumber, double withdrawalAmount, String newPin) {
       newAccount.withdraw(accountNumber, withdrawalAmount, newPin);
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
     System.out.println("\nAccount name : " + newAccount.getName() + "\nAccount number : " + newAccount.getAccountNumber() + "\nAccount Balance : #" + newAccount.getBalance() + "\nPIN : " + newAccount.getPin() );
    }
    public void displayAccountBalance() {
     System.out.printf("%nDear %s, your account has been updated and your current balance is #%.2f %n", newAccount.getName() ,
    newAccount.getBalance());
    }
    public String getName(){
    return name;
    }
}
