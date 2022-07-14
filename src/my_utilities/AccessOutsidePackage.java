package my_utilities;

import day47_encapsulation.AccessModifier;

public class AccessOutsidePackage {

    public static void main(String[] args) {

        //different class, different package

            AccessModifier obj = new AccessModifier();
            System.out.println(obj.a);
//            System.out.println(obj.b);
//            System.out.println(obj.c);

            System.out.println(AccessModifier.x);
//            System.out.println(AccessModifier.y);
//            System.out.println(AccessModifier.z);

            // c and z are private, so they can only be accessed in the same class

            // b abd y are default(didn't have any other access modifier), so they can only be accessed in the same package

            // only a and x are accessible, they are public
    }
}
