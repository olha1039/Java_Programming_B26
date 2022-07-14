package day30_arrays;

import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        String[] names = {"Pete", "Ben", "Alysa", "Flora" };
        int[] score = {78, 65, 90, 43};
        char[] grade = new char[names.length];


        for (int i = 0; i < score.length; i++) {
            if (score[i] > 85) {
                grade[i] = 'A';
            } else if (score[i] >= 75 && score[i] < 85){
                grade[i] = 'B';
            } else if(score[i] >= 65 && score[i] < 75){
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }

        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + score[i] + " | " + grade[i]);
        }
    }
}

