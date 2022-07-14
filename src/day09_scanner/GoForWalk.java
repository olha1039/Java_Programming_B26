package day09_scanner;

public class GoForWalk {
    public static void main(String[] args) {

        // We want to go for a walk

        // We will go for a walk if it is not raining and the weather

        // There is no need to check the weather if it is raining

        boolean isRaining = true;
        int temperature = 60;

        System.out.println(!isRaining && temperature > 70);
        System.out.println("go for walk" + (!isRaining && temperature > 70)); // !false -> true
    }
}
