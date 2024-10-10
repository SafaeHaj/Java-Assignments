package practice.inheritance.bankingapp;

public class WithdrawalTransaction extends Transaction {

 public WithdrawalTransaction(BankAccount account, double amount) {
     super(account, amount); 
 }

 @Override
 public void execute() {
     if (account.getBalance() >= amount) {
         account.withdraw(amount);
         System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber() + ".\nNew balance: " + account.getBalance());
     } else {
         System.out.println("You are poor.");
     }
 }
}
