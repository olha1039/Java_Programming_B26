package day13_if_statements.day12_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'G';

//        if(letter >= 97 && letter < 122){
//            System.out.println("lowercase");
//            //        }

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("lowercase");
        }

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Uppercase");
        }
    }
}
