package day04_variables;

public class PrintDate {
    /*
    Task:
        declare and assign 3 variables
        the month number, the day number, and year number

        print the date in the following format:
            month/date/ year
     */
    public static void main(String[] args) {

    int month = 2;
    int day = 5;
    int year = 2022;

        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "-" + day + "-" + year);


}
 }