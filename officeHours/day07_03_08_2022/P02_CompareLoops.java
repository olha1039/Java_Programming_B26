package day07_03_08_2022;

public class P02_CompareLoops {
    public static void main(String[] args) {

        int num = 10;

        for (int i = 0; i < num; i++) {
            System.out.println("Hello from B26 FOR");

        }

        System.out.println("==================");
        // if(num<10){ // checks only once
        while(num<10){ //repeated if condition -- thinks first then execute to code
            System.out.println("Hello from B-26 WHILE");

            break;
        }
        System.out.println("=================");

        do {
            System.out.println("Hello from B-26 DO-WHILE");
        } while(num<10); // do it first then think it later

    }
}
