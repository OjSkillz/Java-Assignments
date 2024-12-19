import java.security.SecureRandom;

public class Account {
  private String customerName;
  private double customerBalance;
  private String bvn;
  private String pin;
  private long accountNumber;
  
 SecureRandom randomNumber = new SecureRandom();
  public void deposit(long accountNumber, double depositAmount, String newPin) {
     if (!this.pin.equals(newPin) || this.accountNumber != accountNumber) System.out.println("Account number or PIN incorrect!");
   else if(depositAmount > 0.0 && this.pin.equals(newPin) && this.accountNumber == accountNumber) {
    customerBalance += depositAmount;
    displayAccount() ;
    }
  }
  public void withdraw(long accountNumber, double withdrawalAmount, String newPin) {
     if (!this.pin.equals(newPin) || this.accountNumber != accountNumber) System.out.println("Account number or PIN incorrect");
    if (withdrawalAmount > customerBalance) 
    System.out.println("\nWithdrawal amount exceeded account balance!");
    else if (withdrawalAmount > 0.0 && this.pin.equals(newPin) && this.accountNumber == accountNumber) {
    customerBalance -= withdrawalAmount; 
    if (customerBalance > 0.00) displayAccount() ;
    }
  }
    
    public void transfer(long sourceAccountNumber, long destinationAccountNumber, double transferAmount, String pin) {
      if (this.pin.equals(pin) && accountNumber == sourceAccountNumber && transferAmount > 0.00 ) {
      customerBalance -= transferAmount;
      
      }
    }
   public void setName(String name) {
    customerName = name;
  }  
  public String getName() {
    return customerName;
  }
  
  public double getBalance() {
    return customerBalance;
  }
  public void setAccountNumber() {
  accountNumber = 20407061045L + randomNumber.nextLong(500) * 1000;
  }
  
  public long getAccountNumber() {

    return accountNumber;
    }
 public void setPin(String pin) {
  if(pin.length() == 4) 
    this.pin = pin;
  else System.out.println("Invalid pin!");
 }
public void setBvn(String bvn) {
  this.bvn = bvn;
}
public void displayAccount() {
   System.out.printf("%nDear %s, your account has been updated and your current balance is #%.2f %n", getName(),
    getBalance() );
}
}

