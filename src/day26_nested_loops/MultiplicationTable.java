package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
            print the multiplication by the numbers from 1 to 10
            we will see for all numbers 1 - 10
         */
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(1 + " x " + i + " = " + (1*i) + " | ");                  manual idea

        for(int num = 1; num <= 10; num++){

            for(int multi = 1; multi <= 10; multi++){

                System.out.print(num + " x " + multi + " = " + (num * multi) + " | " );
            } // end of the inner loop

            System.out.println();

        } // end of the outer loop



    }
}
