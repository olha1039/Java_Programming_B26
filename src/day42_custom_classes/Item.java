package day42_custom_classes;

public class Item {

    String name;
    double price;

    @Override // can ignore, even delete
    public String toString() {
        return "name: '" + name + '\'' +
                ", price = " + price;
    }
}
