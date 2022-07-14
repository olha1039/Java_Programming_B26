package day37_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,5500,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");

        String resultStr = arr[1].replace(",", ""); // convert to ArrayList
        String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNumber = Long.parseLong(resultStr); // convert to primitive
        double timeNumber = Double.parseDouble(timeStr);

        if(resultNumber >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }

        if(timeNumber <= 2 && timeNumber >= 0){
            System.out.println("TEST CASE PASSED - Under 2 seconds");
        }
    }
}
