package com.brainware.models;
import java.sql.Timestamp;

public class Transaction {
    private int transactionId;
    private int senderAccount;
    private int receiverAccount;
    private double amount;
    private String transactionType; // DEPOSIT, WITHDRAWAL, TRANSFER
    private Timestamp timestamp;

    public Transaction() {}

    // Getters and Setters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

    public int getSenderAccount() { return senderAccount; }
    public void setSenderAccount(int senderAccount) { this.senderAccount = senderAccount; }

    public int getReceiverAccount() { return receiverAccount; }
    public void setReceiverAccount(int receiverAccount) { this.receiverAccount = receiverAccount; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public Timestamp getTimestamp() { return timestamp; }
    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }
}