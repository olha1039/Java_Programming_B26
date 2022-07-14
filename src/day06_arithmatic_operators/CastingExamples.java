package day06_arithmatic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5f; //double as preferred method, don't miss f
        short num4 =(short)num3;

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 30; // 30 is int by default, it automatically goes to float
        // if float num5 = 300, it can't store byte, because byte can handle only 127
        byte num6 = (byte)num5;
        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A'; //character
        int letter2 = letter; //assci table value
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter); //directly casting
        System.out.println((char)66); //assci table value
        System.out.println((int)' '); //assci table value


    }
}
