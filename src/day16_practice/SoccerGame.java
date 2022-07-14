package day16_practice;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left in the game");
        int minutes = input.nextInt();

        if(minutes >= 0 && minutes <= 90) {
            // positive flow
            if (minutes >= 75) { //if(minutes >= 75 && minutes <= 90)
                System.out.println("Game just getting started");
            } else if (minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the game is going great");
            } else {
                System.out.println("The end of the game is approaching");
            }

        } else {
            // negative or false outcome
        } if(minutes < 0){
            System.out.println("Minutes cannot be a negative number");
        }else {
            System.out.println("Games cannot be longer that 90 minutes");

        }
        System.out.println(minutes < 0 ? "Minutes cannot be a negative number" : "Games cannot be longer that 90 minutes"); // ternary approach
    }
}
