package day15_switch;

public class NumberWords {
    /* Take a number and print the number at the word version

    1 -> one
    2 -> two

     */
    public static void main(String[] args) {

        int n = 3;

        switch (n) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }


    }
}
