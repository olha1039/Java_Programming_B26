package day17_04_12_2022;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Neli", "1234567");

        System.out.println(bankAccount);

        bankAccount.checkBalance();

        bankAccount.deposit(1000);

        bankAccount.checkBalance();

        bankAccount.withdraw(100);

        bankAccount.checkBalance();


    }
}
