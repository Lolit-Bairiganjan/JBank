package com.brainware.models;

public class Account {
    private int accountNumber;
    private int userId;
    private String accountType; // SAVINGS, CURRENT, FD
    private double balance;

    public Account() {}

    public Account(int userId, String accountType, double balance) {
        this.userId = userId;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}