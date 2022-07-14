package day00_Interview_practice.from_joseph;

public class Q7_ValidPassword {
    /*
    Q7
Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static boolean isValid(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;

        } else {
            int countDig = 0;
            int countUpLet = 0;
            int countLowLet = 0;
            int countSpecChar = 0;

            for (int i = 0; i < password.length(); i++) {
                char passChar = password.charAt(i);
                if (Character.isDigit(passChar)) { //passChar >= '0' && passChar <= '9'
                    countDig++;
                }
                if (Character.isUpperCase(passChar)) { //passChar >= 'A' && passChar <= 'Z'
                    countUpLet++;
                }
                if (Character.isLowerCase(passChar)) {
                    countLowLet++;
                }
            }
                if ((password.contains("@") || password.contains("#")
                        || password.contains("!") || password.contains("~")
                        || password.contains("$") || password.contains("%")
                        || password.contains("^") || password.contains("&")
                        || password.contains("*") || password.contains("(")
                        || password.contains(")") || password.contains("-")
                        || password.contains("+") || password.contains("/")
                        || password.contains(":") || password.contains(".")
                        || password.contains(", ") || password.contains("<")
                        || password.contains(">") || password.contains("?")
                        || password.contains("|"))) {
                    countSpecChar++;
                }



            if (countDig >= 1 && countSpecChar >= 1 && countUpLet >= 1 && countLowLet >= 1) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isValid("Passw354ord%"));
    }

}

