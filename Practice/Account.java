public class Account {
  private String customerName;
  private double customerBalance;
  
 
  public void deposit(double depositAmount) {
    if(depositAmount > 0.0) customerBalance += depositAmount;
  }
  public void withdraw(double withdrawalAmount) {
    if (withdrawalAmount > 0.0) customerBalance -= withdrawalAmount; 
  }
   public void setName(String name) {
    customerName = name;
  }  
  public String getName() {
    return customerName;
  }
  public void setBalance() {
    customerBalance = 0.00;
  }
  public double getBalance() {
    return customerBalance;
  }
}

