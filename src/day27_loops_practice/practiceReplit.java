package day27_loops_practice;

import java.util.Scanner;

public class practiceReplit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int num = 1;
        int result = 1;
        while (num++ < n) {
            result *= num;
        }
        System.out.println(result);
    }
}
