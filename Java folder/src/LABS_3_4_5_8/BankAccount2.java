package LABS_3_4_5_8;

public class BankAccount2 {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount();
        benben.name = "Benson";
        benben.balance = 17.25;
        System.out.println(benben);
        double Deposit = 3.00;
        System.out.println("Deposit: "+Deposit);
        benben.deposit(Deposit);
        System.out.println(benben);
        double Withdraw = 5.00;
        System.out.println("Deposit: "+Withdraw);
        benben.withdraw(Withdraw);
        System.out.println(benben);
    }

}
