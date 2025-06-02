package bankingapp;

import java.util.Scanner;

public class BankingApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int choice;
		
		do {
			System.out.println("\n --- Simple Banking App ---");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. View Balance");
			System.out.println("5. View Account");
			System.out.println("6. View All Accounts");
			System.out.println("7. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1: {
				
				System.out.println("Enter account number: ");
				String accNmbr = sc.next();
				System.out.println("Enter account holder name: ");
				String name = sc.next();
				
				bank.createAccount(accNmbr, name);
				break;
			}
			
			case 2: {
				
				System.out.println("Enter account number: ");
				String accNmbr = sc.next();
				BankAccount acc = bank.findAccount(accNmbr);
				
				if (acc != null) {
					System.out.println("Enter amount to deposit.");
					double amount = sc.nextDouble();
					acc.deposit(amount);
				} else {
					System.out.println("Account not found.");
				}
				break;
			}
			
			case 3: {
				
				System.out.println("Enter account number: ");
				String accNmbr = sc.next();
				BankAccount acc = bank.findAccount(accNmbr);
				
				if (acc != null) {
					System.out.println("Enter amount to withdraw");
					double amount = sc.nextDouble();
					acc.withDraw(amount);
				} else {
					System.out.println("Account not found.");
				}
				break;
			}
			
			case 4: {
				
				System.out.println("Enter account number: ");
				String accNmbr = sc.next();
				BankAccount acc = bank.findAccount(accNmbr);
				
				if (acc != null) {
					System.out.println("Current Balance: ₹" + String.format("%.2f", acc.getBalance()));
				} else {
					System.out.println("Account not found.");
				}
				break;
				
			}
			
			case 5: {
				
				System.out.println("Enter account number: ");
				String accNmbr = sc.next();
				BankAccount acc = bank.findAccount(accNmbr);
				
				if (acc != null) {
					acc.displayAccountDetails();
				} else {
					System.out.println("Account not found.");
				}
				break;
			}
			
			case 6: {
				bank.displayAccountDetails();
				break;
			}
			
			case 7: {
				System.out.println("Thanks for using the app.");
			}
			
			default:
				throw new IllegalArgumentException("Invalid choice.");
			}
		}
		
		while (choice != 7);
	
		sc.close();
	}
	
}
