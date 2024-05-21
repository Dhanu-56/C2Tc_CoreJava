package com.tnsif.assign3;

public class BankingSystem {
	public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);

        Transaction transaction = new Transaction();

        System.out.println("Performing transactions on SavingsAccount:");
        transaction.performTransaction(savingsAccount,200,"deposit");
        transaction.performTransaction(savingsAccount, 100, "withdraw");

        System.out.println("\nPerforming transactions on CheckingAccount:");
        transaction.performTransaction(checkingAccount, 300, "deposit");
        transaction.performTransaction(checkingAccount, 600, "withdraw");

        System.out.println("\nTotal number of accounts: " + Bank.getTotalAccounts());
    }
}

