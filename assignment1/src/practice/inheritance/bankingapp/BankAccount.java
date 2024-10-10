package practice.inheritance.bankingapp;

public abstract class BankAccount {
	protected String accountNumber;
	protected double balance;
	
	public void deposit(double money) {
		balance += money;
	}
	
	public void withdraw(double money) {
		balance -= money;
	}
	
	public abstract double calculateInterest();
	
	public void displayAccountInfo() {
		String info = "Account n°: %s\nBalance: %f";
		info = String.format(info, accountNumber, balance);
		System.out.println(info);
	}

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
