package day13_if_statements.day12_if_statements;

public class overtime {
    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netPay;
        String message;

        if (numberOfHours > 40) {

            // when the number of hours is more than 40, we will get an extra 1.5 for overtime pay
            double overTimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate * 1.5;
            message = "You worked " + numberOfHours + " hours at the rate of "
                    + hourlyRate + ", but " + overTimeHours + " of the hours were overtime, so you  got an additional pay for those hours. Your net pay was $" + netPay;
        } else {
            // when the number of hours is less than or equal to 40, we will run this code
            netPay = numberOfHours * hourlyRate;
            message = "You worked " + numberOfHours + " hours at the rate of "
                    + hourlyRate + " there was no overtime";
        }

        System.out.println(message);


    }
}
