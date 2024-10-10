package practice.inheritance.bankingapp;

public class SavingsAccount extends BankAccount implements Insurable{

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance*0.1;
	}

	@Override
	public void getInsuranceDetails() {
		
	}
	
}
