package day09_scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        /*
        create and assign these variables:
        name
        are they citizen
        do they have criminal background
        age

        determine if they are eligible to vote, they can vote only of they are citizen, have no criminal background and are about age 18
         */

        String name = "Alice";
        boolean isCitizen = true;
        boolean hasCriminalRecords = false;
        int age = 26;
        boolean isEligible = age >= 18 && isCitizen && !hasCriminalRecords;
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------------------------");
        String name1 = "James Bond";
        boolean isCitizen1 = true;
        boolean hasCriminalBackground1 = true;
        int age1 = 49;

        boolean isEligibleToVote1 =  age1 >= 18 && isCitizen1 && !hasCriminalBackground1; // true && true && (!false -> true)

        System.out.println(name1 + " is eligible to vote: " + isEligibleToVote1);

        // !true -> false



    }
}
