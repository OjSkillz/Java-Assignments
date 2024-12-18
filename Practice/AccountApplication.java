import java.util.Scanner;

public class AccountApplication {
  public static void main (String... args) {
  
  Account newAccount = new Account();
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter preferred name on account >>  ");
  String accountName = input.nextLine();
  newAccount.setName(accountName);
  
  System.out.println();
  System.out.print("Enter your initial deposit >>  ");
  double initialDeposit = input.nextDouble();
  
  newAccount.setBalance();
  newAccount.deposit(initialDeposit);
  


  System.out.printf("%nDear %s, your account has been updated with your initial deposit of #%.2f and your current balance is #%.2f %n", newAccount.getName(), initialDeposit, newAccount.getBalance() );
  
  System.out.println();
  System.out.print("How much would you like to withdraw from your current balance?   ");
  double withdrawalAmount = input.nextDouble();
  
  newAccount.withdraw(withdrawalAmount);
  
  System.out.printf("%nDear %s, your account has been updated with your withdrawal of #%.2f and your current balance is #%.2f %n", newAccount.getName(), withdrawalAmount, newAccount.getBalance() );
  
  }
}
