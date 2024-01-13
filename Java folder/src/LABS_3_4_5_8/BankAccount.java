package LABS_3_4_5_8;

public class BankAccount {
    String name;
    public double balance;
    public double transactionFee = 1.00;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("balance: "+balance+" + amount: "+amount);
    }

    public String toString(){
        return name+", $"+balance;
    }
    public void withdraw(double amount) {
        if ((amount + transactionFee) < balance) {
            balance = balance - amount - transactionFee;
            System.out.println("balance: "+balance+" - amount: "+amount+" - transactionFee: "+transactionFee);
        }
    }
}