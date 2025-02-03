package bankapp;

import java.util.EmptyStackException;

public class Account {
    private String firstName;
    private String lastName;
    private String pin;
    private String bvn;
    private double balance;
    private long accountNumber;

    public Account(long accountNumber, String firstName, String lastName, String pin, String bvn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.bvn = bvn;
        this.accountNumber = accountNumber;
    }


    public double checkBalance(String pin) {
       if(validate(pin))
            return balance;
       throw new IllegalArgumentException("Invalid pin!");
    }


    public void deposit(double depositAmount) {
        if (depositAmount <= 0) throw new IllegalArgumentException("Deposit Amount Must Be Greater Than Zero!");
        balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount, String pin) {
        if (withdrawalAmount > balance) throw new IllegalArgumentException("Cannot withdraw more than current balance!");
        if (withdrawalAmount <= 0) throw new IllegalArgumentException("Cannot withdraw less than current balance!");
        if (!validate(pin)) throw new IllegalArgumentException("Invalid Pin!");
        balance -= withdrawalAmount;
    }

    public String getAccountName() {
        return firstName + " " + lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void updatePin(String oldPin, String newPin) {
        if(!validate(oldPin))
            throw new IllegalArgumentException("Invalid Old Pin!");
        pin = newPin;

    }

    public boolean validate(String pin) {
        return this.pin.equals(pin);
    }
}
