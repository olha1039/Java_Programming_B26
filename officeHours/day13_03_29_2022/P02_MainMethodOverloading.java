package day13_03_29_2022;

public class P02_MainMethodOverloading {
    public static void main(String[] args) {

        // Can we overload main method?
        System.out.println("Hello from String main"); // it runs only Sting main method



    }
    public static void main(int[] args){
        System.out.println("Hello from int main");

    }
    public static void main(double[] args){
        System.out.println("Hello from double main");

    }
    public static void main(char[] args){
        System.out.println("Hello from char main");

    }
}