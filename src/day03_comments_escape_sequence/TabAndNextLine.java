package day03_comments_escape_sequence;

public class TabAndNextLine {


    public static void main(String[] args) {

        System.out.println("This was not tabbed");
        System.out.println("\t This was tabbed once");
        System.out.println("\t\t This was tabbed twice");
        System.out.println("     This was tabbed once without escape");

        //examples of next lines

        System.out.println();
        System.out.println("1) Go to the store");
        System.out.println("2) Grab milk");
        System.out.println("3) wash car");

        // Started code with \n helped to separate tasks up and below

        System.out.println("\n1) Go to the store\n2) Grab milk\n3) Wash car");
    }
}



