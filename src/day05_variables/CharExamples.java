package day05_variables;

public class CharExamples {

    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

    char letterThree = 65; // missing quotation, 65 is A on ascci, computer red number
        System.out.println(letterThree);

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne); // spaces between each other

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne ); // String in the beginning

        System.out.println(letterOne + letterTwo + letterThree + specialOne); // original: 97+90+65+36

    }
}
