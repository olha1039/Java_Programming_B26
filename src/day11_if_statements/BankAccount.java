package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing?");
        double withdraw = input.nextDouble();
        balance -= withdraw;
        if (balance < 0) {
            System.out.println("Took out too much money. $100 overdraft applied");
            System.out.println("Balance before fee: $" + balance);
            balance -= 100;
        }
        System.out.println("Balance $" + balance);
    }
}
