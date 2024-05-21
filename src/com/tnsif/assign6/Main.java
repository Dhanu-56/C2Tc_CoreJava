package com.tnsif.assign6;

public class Main {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 500.0);
        try {
            account.deposit(100.0);
            System.out.println("Deposit successful.");
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
       try {
            account.withdraw(700.0);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
        try {
            account.withdraw(200.0);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}

