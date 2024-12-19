import java.util.ArrayList;
public class Bank {
  private String name;
  private String regNumber;
  private ArrayList<Account> accounts;
  
   public void createAccount (String accountName, String BVN, String PIN) {
    Account newAccount = new Account();
    newAccount.setName(accountName);
    newAccount.setBVN(BVN);
    newAccount.setPIN(PIN);
    accounts.add(newAccount);
   }
}
