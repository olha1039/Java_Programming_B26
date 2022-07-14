package day27_loops_practice;

public class PrimeInRange {
    public static void main(String[] args) {
        /*[IQ] Prime in range

Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47              */
        int range = 50;

        for (int i = 2; i < range; i++) { // check all the numbers from two to range

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + ", ");
            }


        }

    }
}
