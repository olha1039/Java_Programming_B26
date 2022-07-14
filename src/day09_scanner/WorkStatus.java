package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    /*
    task
    create Scanner Object
    ask the user to enter their first name - next
    ask the user to enter their last name
    ask the user if they are employed -boolean
    ask the user if they are student
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        System.out.println("Are you employed?");
        boolean ifEmployed = input.nextBoolean();
        System.out.println("Are you a student?");
        boolean ifStudent = input.nextBoolean();
        String details = firstName + " " + lastName + " is employed: " + ifEmployed + " and they are student: " + ifStudent;
        System.out.println(details);



    }
}
