package day09_scanner.homeworkPractice_day09;

import java.util.Scanner;

public class ThreeAngleNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        boolean isTriangle = (num1 + num2 + num3) == 180;
        boolean isCircle = (num1 + num2 + num3) == 360;

        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}
