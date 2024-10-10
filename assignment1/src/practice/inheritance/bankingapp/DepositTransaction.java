package practice.inheritance.bankingapp;

public class DepositTransaction extends Transaction {

 public DepositTransaction(BankAccount account, double amount) {
     super(account, amount); 
 }
 
 @Override
 public void execute() {
     account.deposit(amount); 
     System.out.println("Deposited " + amount + " into account " + account.getAccountNumber() + ".\nNew balance: " + account.getBalance());
 }
}
