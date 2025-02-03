package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account account;
    private String firstName = "FirstName";
    private String lastName = "LastName";
    private long accountNumber = 1L;
    private String correctPin = "Pin";
    private String wrongPin = "WrongPin";
    private String bvn = "bvn";

    @BeforeEach
    public void createObject() {
        account = new Account(accountNumber, firstName, lastName, correctPin, bvn);
    }

   
    @Test
    public void accountExists_InitialBalanceIsZeroTest() {

        assertEquals(0.00, account.checkBalance(correctPin));
    }

    @Test
    public void deposit5k_CheckBalanceWithWrongPin_throwsIllegalArgumentException() {
        account.deposit(5_000.00);
        assertThrows(IllegalArgumentException.class, () -> account.checkBalance(wrongPin));
    }

    @Test
    public void deposit5k_BalanceIs5kTest() {

        account.deposit(5_000.00);

        assertEquals(5_000.00, account.checkBalance(correctPin));

    }

    @Test
    public void deposit5kWithdraw2k5_balanceIs2k5Test() {
        account.deposit(5_000.00);
        account.withdraw(2_500.00, correctPin);

        assertEquals(2_500.00, account.checkBalance(correctPin));
    }

    @Test
    public void depositAmount_MustBeGreaterThanZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.00));
    }

    @Test
    public void deposit50k_withdraw30kWithWrongPinThrowsIllegalArgumentException() {
        account.deposit(50_000.00);
        assertThrows(IllegalArgumentException.class,() -> account.withdraw(30_000, wrongPin));

    }

    @Test
    public void deposit50k_withdraw100kThrowsIllegalArgumentException() {
        account.deposit(50_000.00);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100_000, correctPin));
    }

    @Test
    public void deposit5k_withdrawNegativeAmountThrowsIllegalArgumentException() {
        account.deposit(5_000.00);
        assertThrows(IllegalArgumentException.class,() -> account.withdraw(-50_000.00, correctPin));
    }

    @Test
    public void getAccountName_returnsFirstNameLastNameTest() {
        assertEquals("FirstName LastName", account.getAccountName());
    }

    @Test
    public void getAccountNumber_returnsAccountNumberTest() {
        assertEquals(accountNumber, account.getAccountNumber());
    }

    @Test
    public void deposit5k_updatePin_balanceCheckWithNewPinReturnsBalanceTest() {
        account.deposit(5_000.00);
        String newPin = "NewPin";
        account.updatePin(correctPin, newPin);
        assertEquals(5_000.00, account.checkBalance(newPin));

    }

    @Test
    public void attemptToUpdatePinWithIncorrectOldPin_throwsIllegalArgumentException() {
        String newPin = "NewPin";
        assertThrows(IllegalArgumentException.class, () -> account.updatePin(wrongPin, newPin));
    }
}
