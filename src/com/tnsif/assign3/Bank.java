package com.tnsif.assign3;

public class Bank {
	    private static int totalAccounts = 0;
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }
	    public static void incrementAccounts() {
	        totalAccounts++;
	    }
	}
	abstract class Account {
	    protected double balance;

	    public Account(double initialBalance) {
	        this.balance = initialBalance;
	        Bank.incrementAccounts();
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    public void printBalance() {
	        System.out.println("The balance is: " + getBalance());
	    }
	}

	class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.02;

	    public SavingsAccount(double initialBalance) {
	        super(initialBalance);
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            balance += balance * INTEREST_RATE;
	           }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }
	}
	class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = -500.0;

	    public CheckingAccount(double initialBalance) {
	        super(initialBalance);
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && (balance - amount) >= OVERDRAFT_LIMIT) {
	            balance -= amount;
	        } else {
	            System.out.println("Overdraft limit exceeded");
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }
	}
	class Transaction {
	    private final double transactionFee = 5.0;

	    public final void performTransaction(Account account, double amount, String type) {
	        switch (type) {
	            case "deposit":
	                account.deposit(amount);
	                account.deposit(-transactionFee);
	                break;
	            case "withdraw":
	                account.withdraw(amount + transactionFee);
	                break;
	            default:
	                System.out.println("Invalid transaction type");
	        }
	        account.printBalance();
	    }

	    public double getTransactionFee() {
	        return transactionFee;
	    }
	}
