package day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String firstName = "Olha";
        String lastName = "Diachkova";
        char gender = 'F';
        int age = 26;
        String companyName = "Apple";
        boolean fulltime = true;
        String jobTitle = "SDET";
        double salary = 1_000_000; // 1,000,000
        int pto = 15;
        boolean married = true;
        char suite = 'B';

        System.out.println("Employee name is " + firstName + " " + lastName + ". The gender is "+ gender + ". Age is " + age + ". Company name is " + companyName + " working full time " + fulltime + " for the position of " + jobTitle + ".");
        System.out.println("The salary is planning to be $" + salary + " with a " + pto + " days PTO time.\n");

        String fullDetails = "Employment information for " + firstName + " " + lastName + ".\n" + jobTitle + " at " + companyName + " currently " + age + " years old.\n" + companyName + " is located in suit " + suite + ". This years salary comes to $" + salary + ".\nOther details: PTO? " + pto + ", full time? " + fulltime + ", married? " + married;

        System.out.println(fullDetails);



    }
}
