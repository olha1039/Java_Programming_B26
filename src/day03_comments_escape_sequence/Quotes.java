package day03_comments_escape_sequence;

import org.w3c.dom.ls.LSOutput;

public class Quotes {

    public static void main(String[] args) {
        /*
        Q: How can you output
         */
        System.out.println("I like \"Java\" programming");
        System.out.println("\"This is a quote\"");

        /*
       The first quite is before java printing the text
       The second quote is to print the " quotation mark in the console
         */

    //I want to print backlash
    System.out.println("abc\\\\def");

        System.out.println("abs/bcd");
    /*
        The first backslash is for the syntax of escape character
        The second backslash is for the backlash character to be output
     */

}
}

