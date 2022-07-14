package day13_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {

        if(4 > 2)
            System.out.println("Hello");

        if(4 > 10) // this is the if block
            System.out.println("Bye");
        System.out.println("other line"); // independent line. if statement has only one line

        if ( 3 % 2 == 0) // this is the block code, so else works
            System.out.println("even");
        else if (4 > 3)
            System.out.println("odd");
        else if (4 > 1)
            System.out.println("don't do it");
    }
}
