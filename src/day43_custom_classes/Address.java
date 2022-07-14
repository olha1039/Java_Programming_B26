package day43_custom_classes;

public class Address {

    String street;
    String city;
    String state;
    String zipCode;
                    // the first approach -->
//    public Address(String inputStreet, String inputCity, String inputState, String inputZIpCode){
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipCode = inputZIpCode; }
                    //new approach  -->
    public Address(String street, String city, String state, String zipCode) {
        this.street = street; // we are accessing local variables, that are inside the parenthesis;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;


    }
}
