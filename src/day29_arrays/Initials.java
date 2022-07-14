package day29_arrays;

public class Initials {
    public static void main(String[] args) {
        /*
            Initials
            Given an array of classmate's name, first name and last name separated by a space print the initials of everyone
    Ex: Input:
    [ “James Bond”, “Eve Rell”, “Anna Johnson” ] Output:
    JB ER AJ
     */

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        for (int i = 0; i < names.length; i++) {

            String fullName = names[i];
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); //indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));


        }
        System.out.println();

        for (String str : names) {
            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); //indexOf(" ") + 1
//            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));


            System.out.println(str.trim().substring(0, 1) + str.substring(str.indexOf(" ")).trim().charAt(0));
        }
    }
}
