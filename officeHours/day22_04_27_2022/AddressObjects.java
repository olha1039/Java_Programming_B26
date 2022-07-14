package day22_04_27_2022;

public class AddressObjects {

    public static void main(String[] args) {

        // There is no-arg constructor
        // Address address = new Address();

        Address cydeo = new Address ("7925 Jones Branch DR Suite 3300", "McLean", "VA", "223182", "USA");
        System.out.println(cydeo);

        // write data --> SETTER

        cydeo.setCity("Tysons");

        //read data
        System.out.println(cydeo.getCity());

        /*
        Make a country name read only

            - Delete setter method for country name
         */

        // cydeo.setCountry(""); It is read_only

        /*
            Make zipCode WRITE_ONLY

            -Delete getter
         */

        //cydeo.getZipCode(); getter was deleted to make the code write only
    }
}
