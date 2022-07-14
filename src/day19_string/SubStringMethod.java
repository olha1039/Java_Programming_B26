package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";
        //index       012345
        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(3)); // day
        System.out.println(str.substring(0,3)); // sun

        System.out.println(str);
        System.out.println("satur" + str.substring(3)); // saturday

        System.out.println(str.substring(2, 4)); //nd
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,6)); //sunday , if 0,7 - out of bounds
    }
}
