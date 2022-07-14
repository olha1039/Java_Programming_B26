package day57_exceptions.webelement;

public class Google {
    public static void main(String[] args) {

        WebElement link = new Link(); // created a Link object with WebElement reference

        WebElement input = new Input(); // created an Input object with WebElement reference

        WebDriverUnit.clickElement(link); // calling the method from Link class

        WebDriverUnit.clickElement(input); // calling the method from Input class

        WebDriverUnit.clickElement(new Link());

        /*
            String [] --> array that stores String objects

            Link [] --> array that stores Link Objects

         */

        WebElement [] allElements = new WebElement[4]; // created an array that will store objects from classes that implement the WebElement interface
        // [null, null, null, null]

        allElements[0] = link; // [LINK obj], null, null, null]
        allElements[1] = input; // [LINK obj, INPUT obj, null, null]
        allElements[2] = new Input(); // [LINK obj, INPUT obj, INPUT obj, null]
        allElements[3] = new Image(); // [LINK obj, INPUT obj, INPUT obj, IMAGE obj]
    }
}
