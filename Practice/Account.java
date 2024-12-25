import java.security.SecureRandom;

public class Account {
      private String customerName;
      private double customerBalance;
      private String bvn;
      private String pin;
      private long accountNumber;
  
      SecureRandom randomNumber = new SecureRandom();
 
    public void deposit(double depositAmount) {
    customerBalance += depositAmount;  
    }
  
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > customerBalance) {
            System.out.println("\nWithdrawal amount exceeded account balance!");
      return;
      }
      else {
          customerBalance -= withdrawalAmount; 
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
  public void updateBalance(double newBalance) {
    customerBalance = newBalance;
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
 public String getPin() {
  return pin;
 }
public void setBvn(String bvn) {
  this.bvn = bvn;
}
public void displayAccount() {
   System.out.printf("%nDear %s, your account has been updated and your current balance is #%.2f %n", getName(),
    getBalance() );
}
}

