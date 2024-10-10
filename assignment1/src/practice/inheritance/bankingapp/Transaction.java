package practice.inheritance.bankingapp;

public abstract class Transaction {
 protected double amount; 
 protected BankAccount account;

 public Transaction(BankAccount account, double amount) {
     this.account = account;
     this.amount = amount;
 }

 public abstract void execute();
}
