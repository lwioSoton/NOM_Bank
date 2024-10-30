package com.lbg.unittesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void testWithdrawMoney(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");
        b1.withdrawMoney(1);
        assertEquals(999999, b1.getBalance());
    }
    @Test
    public void testBelowMinMoneyReached(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");
        boolean ifMoneyWithdrawed = b1.withdrawMoney(1000001);  //Withdrawing below 0.
        assertEquals(false, ifMoneyWithdrawed);
        // Expecting a boolean to return false if Below Miniumum Money is reached.
    }
    @Test
    public void testGetBalance(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");

    }
    @Test
    public void testSetBalance(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");

    }
    @Test
    public void testGetSetName(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");

    }
    @Test
    public void testSetName(){
        BankAccount b1 = new BankAccount(1000000, 0, "Victoria Lloyd");

    }
}
