package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("address");
        String address = input.nextLine();

        input.nextLine();
        System.out.println("name of owner");
        String ownerName = input.nextLine();

        System.out.println("units number");
        int unitsNumber = input.nextInt();

        System.out.println("average size of each unit");
        int unitSize = input.nextInt();

        System.out.println("monthly rent amount");
        double rentAmount = input.nextDouble();

        System.out.println("number of washers and driers");
        int numberOfWashersAndDriers = input.nextInt();

        System.out.println("allows pets or not");
        boolean pets = input.nextBoolean();

        System.out.println("has a pool");
        boolean pool = input.nextBoolean();

        System.out.println("length of lease");
        int length = input.nextInt();

        System.out.println("total number of residents in the building");
        int residents = input.nextInt();

        System.out.println("phone number of owner");
        String phoneNumber = input.next();

        System.out.println("is near a gas station");
        boolean gasStation = input.nextBoolean();

        System.out.println("number of floors");
        int floors = input.nextInt();

        System.out.println("has a basement");
        boolean basement = input.nextBoolean();

        System.out.println("has available units for rent");
        int availableUnits = input.nextInt();

        System.out.println("has air conditioning");
        boolean airConditioning = input.nextBoolean();

        System.out.println("number of parking spaces");
        int parkingSpaces = input.nextInt();

        System.out.println("has wheelchair access");
        boolean wheelchairAccess = input.nextBoolean();

        System.out.println("number of review stars");
        double numberOfStars = input.nextDouble();

        double rentAfter3Years = rentAmount * 0.9;
        double rentAfter6Years = rentAmount * 0.8;
        int averageNumberOfResidents = residents / unitsNumber;
        int averageNumberOfParkingSpots = parkingSpaces / unitsNumber;
        int averageNumberOfUnitsPerFloor = unitsNumber / floors;

        System.out.println(rentAfter3Years);
        System.out.println(rentAfter6Years);
        System.out.println(averageNumberOfParkingSpots);










    }
}
