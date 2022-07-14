package day63_functional_interface;


import java.util.function.Predicate;

public class UsePredicate {

    public static Predicate<String> isPalindrome = str -> {
        String reverse = new StringBuilder(str).reverse().toString(); // reverse is a build in method in string builder (is a class)
        return str.equals(reverse);
    };

    public static Predicate<Integer> isPrime = n -> {

        if(n == 0 || n == 1) return false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    };


}
