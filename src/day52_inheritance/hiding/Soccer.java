package day52_inheritance.hiding;

public class Soccer extends Sport {

    public static void cheer(){
        System.out.println("Cheering form the child class");
    }
   /*
        Note:

        it looks like we are overriding
        but we are not, because the method static

        we are hiding the cheer method from the parent class

    */
}
