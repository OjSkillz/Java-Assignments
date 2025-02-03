package bankapp;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name = "SCABank";
    private List<Account> accounts = new ArrayList<>();


    public void createAccount(String firstName, String lastName, String correctPin, String bvn) {
        validatePinUniqueness(correctPin);
        validatePinLength(correctPin);
        long accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber,firstName, lastName, correctPin, bvn);

        accounts.add(account);
    }

    private long generateAccountNumber() {
        SecureRandom random = new SecureRandom();
        return 2040706104L + random.nextLong(500) * 1000;
    }

    public long getAccountNumber(String accountName, String pin) {
        return findAccountBy(accountName, pin).getAccountNumber();

    }

    public String getAccountName(String correctPin) {

        return findAccountBy(correctPin).getAccountName();
    }

    public void deposit(long accountNumber, double depositAmount) {
        this.findAccountBy(accountNumber).deposit(depositAmount);
        }


    public double checkBalance(long accountNumber, String correctPin) {

        return this.findAccountBy(accountNumber).checkBalance(correctPin);
    }

    public String bankName() {
        return name;
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public void withdraw(long accountNumber, double withdrawalAmount, String correctPin) {
        findAccountBy(accountNumber).withdraw(withdrawalAmount, correctPin);
        }


    public void transfer(long senderAccountNumber, long receiverAccountNumber, double transferAmount, String pin) {
        findAccountBy(senderAccountNumber).withdraw(transferAmount, pin);
        findAccountBy(receiverAccountNumber).deposit(transferAmount);

    }

    public Account findAccountBy(long accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) return account;
        }
        throw new RuntimeException("Account not found!");
    }

    public Account findAccountBy(String accountName, String pin) {
        for (Account account : accounts) {
            if (account.getAccountName().equals(accountName) && account.validate(pin))
                return account;
        }
       throw new RuntimeException("Account not found!");
    }

    public Account findAccountBy(String pin) {
        for (Account account : accounts) {
            if (account.validate(pin))
                return account;
        }
        throw new RuntimeException("Account not found!");

    }

    public void closeAccount(String accountName, String pin) {
        accounts.remove(findAccountBy(accountName, pin));
    }

    public void updatePin(long accountNumber, String oldPin, String newPin) {
        findAccountBy(accountNumber).updatePin(oldPin, newPin);
    }

    private void validatePinUniqueness(String pin) {
        for (Account account : accounts) {
            if (account.validate(pin)) throw new IllegalArgumentException("Pin already taken by another account!");
        }
    }

    private void validatePinLength(String correctPin) {
        if (correctPin.length() != 4) throw new IllegalArgumentException("Pin must be 4-digits long!");
    }
}
