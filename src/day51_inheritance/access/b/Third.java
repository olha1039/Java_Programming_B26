package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {

    // different class different package
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one); // public
        // System.out.println(obj.two); // protected - not accessible, outside the package, works the same as default;
        // no inheritance  - no  visibility
        // System.out.println(obj.three); // default - not accessible, different package
        // System.out.println(obj.four); private - not accessible, different class and package
    }
}
