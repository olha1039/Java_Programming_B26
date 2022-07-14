package day08_03_09_22;

public class P01_SumOfDigits {
    public static void main(String[] args) {
        /*
            Write a program that can return the sum of digits from a string
            input: A1B2C3D4E5
            Output: 6
         */
        String str = "A1B2C3E4";
        //            012345
        // Manually HARDCODED
       // str.charAt(1) -- return us char data

        System.out.println(str.charAt(1) - 48 + str.charAt(3) - 48 + str.charAt(5) - 48);

        //DYNAMIC

        //first check each char
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(each >= '0' && each <= '9'){

                sum += each-48;
            }
        }
        System.out.println("Dynamic: "  + sum);
    }
}
