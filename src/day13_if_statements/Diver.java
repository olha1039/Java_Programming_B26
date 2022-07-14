package day13_if_statements;

public class Diver {
    public static void main(String[] args) {

        int oxygenLevel = 68;

        if (oxygenLevel > 90) {
            System.out.println("You tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go to far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("Dangerous");
        }

        System.out.println("--------------------------");
        String message;
        if (oxygenLevel > 90) {
            message = "You tank is full";
        } else if (oxygenLevel > 80) {
            message = "Still okay";
        } else if (oxygenLevel > 70) {
            message = "Don't go to far";
        } else if (oxygenLevel > 60) {
            message = "Start to head back";
        } else if (oxygenLevel > 50) {
            message = "Be careful now you are at 50%";
        } else {
            message = "Dangerous";
        }
        System.out.println(message);
    }
}
