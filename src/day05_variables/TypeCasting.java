package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is automatically converted to int, because byte is smaller than int

        int i2 = 100;
        byte b2 = (byte)i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to the byte type using  (byte)

        int i3 = 500;
        long l1 = i3; // int is smaller than long, it will automatically cast

        long l2 = 200;
        int i4 = (int)l2; //trying to go from long to int, must cast it

        double d = 50;
        int i5 = (int)d; //trying to go from double to int type. double is bigger, so it needs to cast

        System.out.println(d);
        System.out.println(i5);



    }
}
