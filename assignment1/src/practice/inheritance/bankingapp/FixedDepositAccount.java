package practice.inheritance.bankingapp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class FixedDepositAccount extends BankAccount {
	private LocalDateTime maturityDate;
	private double interest;
	
	public FixedDepositAccount(String accountNumber, LocalDateTime maturityDate, double interest) {
		super(accountNumber, 0);
		this.maturityDate = maturityDate;
		this.interest = interest;
	}
	
	@Override
	public void withdraw(double money) {
	    LocalDateTime now = LocalDateTime.now();
		if (ChronoUnit.HOURS.between(now, maturityDate) < 24) {
	        interest -= 0.01;  
	    }
		balance -= money;
	}

	@Override
	public double calculateInterest() {
		interest = balance*0.005;
		return interest;
	}
	
	
}
