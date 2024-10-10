package practice.inheritance.bankingapp;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV001", 1000.0);
        BankAccount checking = new CheckingAccount("CHK001", 2000.0);

        BankAccount[] accounts = {savings, checking};

        Transaction depositTransaction = new DepositTransaction(savings, 200.0);
        Transaction withdrawalTransaction = new WithdrawalTransaction(checking, 150.0);

        depositTransaction.execute();
        withdrawalTransaction.execute();

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}
