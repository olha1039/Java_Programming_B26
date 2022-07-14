package day00_Interview_practice.from_joseph;

public class Q5_Reverse {
/*
Q5
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */
        // regular
    public static String reverse(String s) {

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
        //stingBuilder
    public static void reverse2(String s) {

        StringBuilder stringBld = new StringBuilder(s);
      //  stringBld.append(s);
        stringBld.reverse();
        System.out.println(stringBld);
    }
        //stringBuffer
    public static void reverse3(String str){

        StringBuffer strBuf = new StringBuffer(str);
        strBuf.reverse();
        System.out.println(strBuf);
    }

        //convert to array
    public static void reverse4(String str) {

        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
        //runner
        public static void main (String[]args){

            System.out.println(reverse("ABCD"));
            reverse2("ABCD");
            reverse3("ABCD");
            reverse4("ABCD");

        }
    }
