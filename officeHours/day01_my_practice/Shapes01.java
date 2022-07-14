package day01_my_practice;

public class Shapes01 {
    public static void main(String[] args) {


//outer loop for rows
        for (int i = 0; i < 9; i++) {
//inner loop for columns
            for (int j = 0; j <= 9; j++) { // 9 gives me square; i gives me triangle.
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
