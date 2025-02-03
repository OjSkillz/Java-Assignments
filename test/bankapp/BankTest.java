package bankapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private String firstName = "FirstName";
    private String lastName = "LastName";
    private String correctPin = "####";
    private String wrongPin = "XXXX";
    private String bvn = "bvn";

    @Test
    public void deposit5k_balanceIs5kTest() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 5_000.00;
        bank.deposit(accountNumber, depositAmount);
        assertEquals(5_000.00, bank.checkBalance(accountNumber, correctPin));

    }

    @Test
    public void deposit0k_throwsIllegalArgumentException() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 0.00;
        assertThrows(IllegalArgumentException.class, () -> bank.deposit(accountNumber, depositAmount));
    }

    @Test
    public void depositNegativeAmount_throwsIllegalArgumentException() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = -5_000.00;
        assertThrows(IllegalArgumentException.class, () -> bank.deposit(accountNumber, depositAmount));
    }

    @Test
    public void deposit5kTwice_balanceIs10kTest() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 5_000.00;
        bank.deposit(accountNumber, depositAmount);
        assertEquals(5_000.00, bank.checkBalance(accountNumber, correctPin));

       bank.deposit(accountNumber, depositAmount);
       assertEquals(10_000.00, bank.checkBalance(accountNumber, correctPin));

    }

    @Test
    public void createMultipleAccounts_numberOfAccountsReturnsAccurateValueTest() {
        Bank bank = new Bank();
        assertEquals(0, bank.getNumberOfAccounts());
        bank.createAccount("John", "Smith", "4567", "3475838839");
        assertEquals(1, bank.getNumberOfAccounts());
        bank.createAccount("Michael", "Jinad", "5578", "65742839948" );
        assertEquals(2, bank.getNumberOfAccounts());
    }

    @Test
    public void deposit10k_withdraw5k_balanceIs5kTest() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 10_000.00;
        bank.deposit(accountNumber, depositAmount);
        double withdrawalAmount = 5_000.00;
        bank.withdraw(accountNumber, withdrawalAmount, correctPin);
        assertEquals(5_000.00, bank.checkBalance(accountNumber, correctPin));
    }

    @Test
    public void deposit5k_withdraw10k_throwsIllegalArgumentException() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 5_000.00;
        bank.deposit(accountNumber, depositAmount);
        double withdrawalAmount = 10_000.00;
        assertThrows(IllegalArgumentException.class, ()-> bank.withdraw(accountNumber, withdrawalAmount, correctPin));
    }

    @Test
    public void balanceIsZero_withdraw10k_throwsIllegalArgumentException() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        assertEquals(0.00, bank.checkBalance(accountNumber, correctPin));
        double withdrawalAmount = 10_000.00;
        assertThrows(IllegalArgumentException.class, ()-> bank.withdraw(accountNumber, withdrawalAmount, correctPin));
    }

    @Test
    public void deposit10k_withdraw5kWithWrongPin_throwsIllegalArgumentException() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        String accountName = bank.getAccountName(correctPin);
        long accountNumber = bank.getAccountNumber(accountName, correctPin);
        double depositAmount = 10_000.00;
        bank.deposit(accountNumber, depositAmount);
        double withdrawalAmount = 10_000.00;
        assertThrows(IllegalArgumentException.class, ()-> bank.withdraw(accountNumber, withdrawalAmount, wrongPin));
    }

    @Test
    public void deposit50k_transfer30k_balanceIs25kTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        bank.createAccount("Michael", "Jinad", "5578", "65742839948" );
        String senderName = bank.getAccountName("4567");
        long senderAccountNumber = bank.getAccountNumber(senderName, "4567");
        double depositAmount = 50_000.00;
        bank.deposit(senderAccountNumber, depositAmount);

        String receiverName = bank.getAccountName("5578");
        long receiverAccountNumber = bank.getAccountNumber(receiverName, "5578");

        double transferAmount = 30_000.00;
        bank.transfer(senderAccountNumber, receiverAccountNumber, transferAmount, "4567");
        assertEquals(20_000.00, bank.checkBalance(senderAccountNumber, "4567"));
        assertEquals(30_000.00, bank.checkBalance(receiverAccountNumber, "5578"));
    }

    @Test
    public void deposit5k_transfer10k_throwsIllegalArgumentException_balanceIs5kTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        bank.createAccount("Michael", "Jinad", "5578", "65742839948" );
        String senderName = bank.getAccountName("4567");
        long senderAccountNumber = bank.getAccountNumber(senderName, "4567");
        double depositAmount = 5_000.00;
        bank.deposit(senderAccountNumber, depositAmount);

        String receiverName = bank.getAccountName("5578");
        long receiverAccountNumber = bank.getAccountNumber(receiverName, "5578");

        double transferAmount = 10_000.00;
        assertThrows(IllegalArgumentException.class, ()-> bank.transfer(senderAccountNumber, receiverAccountNumber, transferAmount, "4567"));
        assertEquals(5_000.00, bank.checkBalance(senderAccountNumber, "4567"));

    }

    @Test
    public void deposit10k_transfer5kWithWrongPin_throwsIllegalArgumentExceptionTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        bank.createAccount("Michael", "Jinad", "5578", "65742839948" );
        String senderName = bank.getAccountName("4567");
        long senderAccountNumber = bank.getAccountNumber(senderName, "4567");
        double depositAmount = 10_000.00;
        bank.deposit(senderAccountNumber, depositAmount);

        String receiverName = bank.getAccountName("5578");
        long receiverAccountNumber = bank.getAccountNumber(receiverName, "5578");

        double transferAmount = 5_000.00;
        assertThrows(IllegalArgumentException.class, ()-> bank.transfer(senderAccountNumber, receiverAccountNumber, transferAmount, wrongPin));
        assertEquals(10_000.00, bank.checkBalance(senderAccountNumber, "4567"));
    }


    @Test
    public void openMultipleAccounts_closeAccount_findAccountThrowsIllegalArgumentExceptionTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        bank.createAccount("Michael", "Jinad", "5578", "65742839948" );
        bank.createAccount("Frank", "Underwood", "8710", "357857848");
        String targetAccountName = bank.getAccountName("5578");
        long accountNumber = bank.getAccountNumber(targetAccountName, "5578");
        bank.closeAccount(targetAccountName, "5578");
        assertThrows(RuntimeException.class, ()-> bank.findAccountBy(accountNumber));
        assertThrows(RuntimeException.class, ()-> bank.findAccountBy(targetAccountName, "5578"));
        assertThrows(RuntimeException.class, ()-> bank.findAccountBy("5578"));
    }

    @Test
    public void accountCanUpdatePin_newPinCanAccessAccountBalanceTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        String accountName = bank.getAccountName("4567");
        long accountNumber = bank.getAccountNumber(accountName, "4567");
        bank.deposit(accountNumber, 50_000.00);
        bank.updatePin(accountNumber, "4567", "newPin");
        assertEquals(50_000.00, bank.checkBalance(accountNumber, "newPin"));

    }
    @Test
    public void accountCannotUpdatePinWithWrongOldPin_throwsIllegalArgumentExceptionTest() {
        Bank bank = new Bank();
        bank.createAccount("John", "Smith", "4567", "3475838839");
        String accountName = bank.getAccountName("4567");
        long accountNumber = bank.getAccountNumber(accountName, "4567");
        bank.deposit(accountNumber, 50_000.00);

        assertThrows(IllegalArgumentException.class, ()-> bank.updatePin(accountNumber, wrongPin, "newPin"));
    }

    @Test
    public void pinLengthIsNotFourDigits_throwsIllegalArgumentExceptionTest() {
        Bank bank = new Bank();
        assertThrows(IllegalArgumentException.class, ()-> bank.createAccount(firstName, lastName, "45678", "4656346364663"));
        assertThrows(IllegalArgumentException.class, ()-> bank.createAccount(firstName, lastName, "454", "4656346364663"));
    }

    @Test
    public void createDifferentAccountsWithSamePin_throwsIllegalArgumentExceptionTest() {
        Bank bank = new Bank();
        bank.createAccount(firstName, lastName, correctPin, bvn);
        assertThrows(IllegalArgumentException.class, ()-> bank.createAccount(firstName, lastName, correctPin, bvn));
    }



}
