package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone X"); // calls line 21 "Phone"
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 12", "Apple"); // calls the constructor on line 25
        System.out.println(phone2);

        Phone phone3 = new Phone("Galaxy s 22", "Samsung", 128, 10.2); // line 29
        System.out.println(phone3);

    }
}
