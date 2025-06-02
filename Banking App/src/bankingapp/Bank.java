package bankingapp;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public void createAccount(String accNmbr, String name) {
		
		
		if (findAccount(accNmbr) != null) {
			System.out.println("Account with this number already exist.");
			return;
		}
		BankAccount account = new BankAccount(accNmbr, name);
		accounts.add(account);
		System.out.println("Account created successfully.");
		
	}
	
	public BankAccount findAccount(String accNmbr) {
		
		for (BankAccount acc : accounts) {
			
			if (acc.getAccountNumber().equals(accNmbr)) {
				return acc;
			}
			
		}
		System.out.println("Account not found.");
		return null;
				
	}
	
	public void displayAccountDetails() {
		
		if (accounts.isEmpty()) {
			System.out.println("No accounts available.");
		}
		
		for (BankAccount acc : accounts) {
			acc.displayAccountDetails();
			System.out.println("--------------------------");
		}
		
	}
	
}
