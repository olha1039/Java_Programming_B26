package day09_scanner;

public class Discount {
    public static void main(String[] args) {
        /*
        declare and assign
        is it a weekend
        are u a teacher
        are u a police office
        are u a firefighter

        Do you get a discount?
        Must be a weekend and you must be one of the giver professions
         */
        boolean isWeekend = true;
        boolean isATeacher = false;
        boolean isAPoliceOfficer = false;
        boolean isAFireFighter = true;
        boolean getDiscount = isWeekend &&
                (isATeacher || isAPoliceOfficer || isAFireFighter);

        System.out.println("Do you get a discount? " + getDiscount);

    }
}
