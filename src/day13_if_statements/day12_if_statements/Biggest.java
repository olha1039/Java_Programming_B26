package day13_if_statements.day12_if_statements;

public class Biggest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 9;
        int num3 = 456;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the biggest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }

    }
}
