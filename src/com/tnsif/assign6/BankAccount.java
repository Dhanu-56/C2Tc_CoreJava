package com.tnsif.assign6;

public class BankAccount {
	private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account.");
        }
        balance -= amount;
    }
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}


