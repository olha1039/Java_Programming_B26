package day05_variables.homework05;

public class House {
    public static void main(String[] args) {

        String houseType, address;
        int numberOfBedrooms, numberOfBathrooms, numberOfKitchens, zipcode;
        double costOfTheHouse, ratingOfSurroundingSchools;
        boolean isThereABasement, isThereAnAttic, isThereAPool, isTheHouseForSale, isAParkNearBy;

        //---------------------------------------

        houseType = "Townhouse";
        address = "5010 Green St";
        numberOfBathrooms = 3;
        numberOfBedrooms = 4;
        numberOfKitchens = 1;
        zipcode = 163456;
        isThereABasement = true;
        isThereAnAttic = false;
        isThereAPool = true;
        isTheHouseForSale = true;
        isAParkNearBy = true;
        ratingOfSurroundingSchools = 4.5;
        costOfTheHouse = 570_000;

        String realEstateMessage = "A beautiful family " + houseType + " located on the " + address + " ,zipcode " + zipcode + " has viewings tomorrow afternoon. Come and see it yourself. Below are all of the characteristics.\n" + "Is the house for sale: " + isTheHouseForSale + "\nIs there a basement: " + isThereABasement + "\nNumber of Bedrooms: " + numberOfBedrooms + "\nNumber of Bathrooms: " + numberOfBathrooms + "\nNumber of Kitchens: " + numberOfKitchens + "\nIs there a Pool: " + isThereAPool + "\nIs there an attic: " + isThereAnAttic + "\nIs there a park near by: " + isAParkNearBy + "\nWhat is the rating of surrounding school district: " + ratingOfSurroundingSchools + "\nHouse price is $" + costOfTheHouse + "\n\tPlease come, see and fell in love with you future house!";
        System.out.println(realEstateMessage);



    }
}
