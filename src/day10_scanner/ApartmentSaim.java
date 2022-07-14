package day10_scanner;

import java.util.Scanner;

public class ApartmentSaim {
    public static void main(String[] args) {

        String address, nameOfOwner, ownersPhoneNumber;
        int numberOfUnits, numberOfWashersAndDriers, lengthOfLease, totalNumberOfResidents, numberOfFloors, numberOfParkingSpots;
        double avrSizeofUnit, monthlyRent, numberOfStars;
        boolean allowsPets, hasPool, nearGasStation, hasBasement, unitsAvailable, hasAirConditioning, wheelCharAccessibility;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the address");
        address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        nameOfOwner = input.nextLine();
        System.out.println("Please enter the " + nameOfOwner + "'s phone number");
        ownersPhoneNumber = input.nextLine();
        System.out.println("Please enter the number of units");
        numberOfUnits = input.nextInt();
        System.out.println("Please enter the number of washers and dryers");
        numberOfWashersAndDriers = input.nextInt();
        System.out.println("Please enter the length of the lease");
        lengthOfLease = input.nextInt();
        System.out.println("Please enter the number of residents");
        totalNumberOfResidents = input.nextInt();
        System.out.println("Please enter the number of floors");
        numberOfFloors = input.nextInt();
        System.out.println("Please enter the number of parking spots");
        numberOfParkingSpots = input.nextInt();
        System.out.println("Please enter average size of units");
        avrSizeofUnit = input.nextDouble();

        System.out.println("Does the apartment allow pets?");
        allowsPets = input.nextBoolean();
        System.out.println("Does apartment have a pool?");
        hasPool = input.nextBoolean();

//        double rateAfterThreeYears = monthlyRent * 0.9; // monthlyRent - (monthlyRent - 0.1)
//        double rateAfterSixYears = monthlyRent * 0.8;
        int avrNumberOfResPerUnits = totalNumberOfResidents / numberOfUnits;
        int avrNumberOfParkingSpots = numberOfParkingSpots / numberOfUnits;
        int avgNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;







    }
}
