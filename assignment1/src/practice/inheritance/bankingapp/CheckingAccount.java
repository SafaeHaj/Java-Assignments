package practice.inheritance.bankingapp;

public class CheckingAccount extends BankAccount implements Insurable{
	private double overdraftLimit;
	
	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double money) {
		if (money > overdraftLimit) {
			System.out.println("Hey that money sum is higher than our predefined limit!");
			return;
		}
		balance -= money;
        System.out.println("Withdrew " + money + " from account " + accountNumber + ".\nNew balance: " + balance);

	}

	@Override
	public double calculateInterest() {
		return 0;
	}

	@Override
	public void getInsuranceDetails() {		
	}
}
