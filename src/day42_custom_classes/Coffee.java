package day42_custom_classes;

public class Coffee {
    /*
        Create a coffee class with these instance variables:
        price, size(oz), brand, types

        instance methods:

        * make a toString to print all thw information of the coffee objects

        * drink: print trying type of coffee

        * refill (amount in oz): print refilling x oz
            add the number of oz to the total size
     */

    String brand;
    double price;
    String type;
    double size;

    public String toString(){
        return type + " from " + brand + " size of " + size + " oz. For a total price of " + price;

    }
    public void drink(){
        System.out.println("Drinking "  + type);
        size -= 1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");
        size += amount;
    }
}
