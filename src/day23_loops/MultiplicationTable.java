package day23_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
     /*
     Task: declare and assign a number
     print all the multiplication results for 1 through 10
     Ex
     4
      4 x 1 = 4
      4 x 2 = 8
      */
    int number = 4;

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}

