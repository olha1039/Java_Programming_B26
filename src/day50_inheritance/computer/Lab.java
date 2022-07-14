package day50_inheritance.computer;

public class Lab {

    public static void main(String[] args) {

        Computer obj1 = new Computer("generic os", 300);
        System.out.println(obj1); // this is parent class

        Windows obj2 = new Windows(500); // here we are calling child class
        System.out.println(obj2);

        Mac obj3 = new Mac("Mac", 300);
        System.out.println(obj3);



    }
}
