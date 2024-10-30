package com.lbg.unittesting;

public class BankAccount {

    private long balance;
    private long minBalance;
    private String accountHolder;
    public BankAccount(long balance, long minBalance, String accountHolder){
        this.setBalance(balance);
        this.setMinBalance(minBalance);
        this.setAccountHolder(accountHolder);
    }

    public long getBalance() {
        return balance;
    }

    private void setBalance(long balance) {
        this.balance = balance;
    }

    public long getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(long minBalance) {
        this.minBalance = minBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public boolean withdrawMoney(long amountWithdrawled){
        if ((this.balance - amountWithdrawled) < minBalance)
            return false;
        else {
            this.setBalance(this.balance - amountWithdrawled);
            return true;
        }
    }
}
