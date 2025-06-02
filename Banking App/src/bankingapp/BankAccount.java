package bankingapp;

public class BankAccount {
	
	private String accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount (String accountNumber, String name) {
		
		this.accountNumber = accountNumber;
		this.accountHolderName = name;
		this.accountBalance = 0.0;
		
	}
	
	public void deposit(double amount) {
		
		accountBalance += amount;
		System.out.println("Deposit Successfull.");
		
	}
	
	public void withDraw(double amount) {
		
		if (amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("Withdraw successful.");
		} else {
			System.out.println("Insufficient balance.");
		}
		
	}
	
	public void displayAccountDetails() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n --- Account Details ---");
		sb.append("----------------------------\n");
		sb.append("Account number: ").append(accountNumber).append("\n");
		sb.append("Account holder name: ").append(accountHolderName).append("\n");
		sb.append("Balance ₹: ").append(accountBalance).append("\n");
		sb.append("------------------------------\n");
		
		System.out.println(sb.toString());
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return accountBalance;
	}
	
}
