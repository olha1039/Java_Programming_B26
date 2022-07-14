package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello World");
        }
        System.out.println("Second line");

        if (true) {
            System.out.println("Today is Monday");
        }
            int score = 80;
            if (score >= 75) {
                System.out.println("Passing");
            }
            if (score < 75) {
                System.out.println("Falling");
            }
            int year = 2022;
            boolean lockdown = year == 2020 || year == 2021;
            if(lockdown){
                System.out.println("Stay at home");
                System.out.println("Practice Java");
                System.out.println("Wear mask");

            }
            if(!lockdown){ // !false -> true
                System.out.println("Party");
                System.out.println("Still practice Java");
                System.out.println("Maybe travel");
            }

            // in the situation where the lockdown value is true | !true -> false


        }
    }

