package day51_inheritance.access.a;

public class Second {

    // different class same package
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one); // public
        System.out.println(obj.two); // protected
        System.out.println(obj.three); // default
        // System.out.println(obj.four); private - not accessible different class
    }
}
