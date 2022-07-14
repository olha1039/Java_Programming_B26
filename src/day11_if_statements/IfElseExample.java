package day11_if_statements;

public class IfElseExample {
    public static void main(String[] args) {

        int score = 50;
        if(score >= 75) {
            System.out.println("Passing");
        }else{
            System.out.println("Falling");
        }

        int year = 2021;
        boolean lockdown = year == 2020 || year == 2021;
        if(lockdown) {
            System.out.println("Stay at Home");
            System.out.println("Practice Java");
            System.out.println("Wear mask");
        }else{
            System.out.println("Party");
            System.out.println("Still practice Java");
            System.out.println("Maybe travel");
        }

    }
}
