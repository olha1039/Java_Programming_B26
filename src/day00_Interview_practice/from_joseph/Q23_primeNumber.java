package day00_Interview_practice.from_joseph;

public class Q23_primeNumber {

    // Write a method that can check if a number is prime or not
    // prime number should be divisible by one and itself without remainder

    public static boolean primeNumber(int n){

        boolean isPrime = n > 1;
        for (int i = 2; i < n/2; i++) {
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(4)); // prime numbers: 2, 3, 5, 7, 11
    }

}
