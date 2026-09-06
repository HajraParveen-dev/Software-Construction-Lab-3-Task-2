package BankAccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);

        assertEquals(700, account.getBalance(), 0.01);
    }

    @Test
    void testOverdraft() {
        BankAccount account = new BankAccount();

        account.deposit(500);

        assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(800)
        );
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount();

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-100)
        );
    }

}
