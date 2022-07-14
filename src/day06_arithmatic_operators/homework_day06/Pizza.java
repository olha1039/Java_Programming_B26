package day06_arithmatic_operators.homework_day06;

public class Pizza {
    public static void main(String[] args) {

        String pizzaType = "Cheese Pizza";
        int numberOfSlices = 8;
        int numberOfPeopleEating = 2;

        int slicesPerPerson = numberOfSlices / numberOfPeopleEating;
        int slicesLeftOver = numberOfSlices % numberOfPeopleEating;

        System.out.println(slicesPerPerson);
        System.out.println(slicesLeftOver);


    }
}
