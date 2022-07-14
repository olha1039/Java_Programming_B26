package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();

        boolean isTriangle = angleOne + angleTwo + angleThree ==100;
        boolean isCircle = angleOne + angleTwo + angleThree ==360;
        // double sum = angleOne + angleTwo + angleTree;
//        boolean isTriangle = sum == 180;

        System.out.println("is a triangle: " + isTriangle);
        System.out.println("is a circle: " + isCircle);


    }
}
