package day14_if_statements;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = input.nextInt();
        String pandemic;
        if (year >= 1346 && year <= 1353){
           pandemic = "The Black Death";
        } else if (year >= 1665 && year <= 1666){
            pandemic = "Great Plague of London";
        }else if (year >= 1770 && year <= 1772){
            pandemic = "Russian Plague";
        }else if (year >= 1889 && year <= 1890){
            pandemic = "Flu Pandemic";
        }else if (year == 1916){
            pandemic = "American polio epidemic";
        }else if (year >= 1918 && year <= 1920){
            pandemic = "Spanish Flu";
        }else if (year >= 2009 && year <= 2010){
            pandemic = "H1N1 Swine Flu pandemic";
        }else if (year >= 2014 && year <= 2016){
            pandemic = "West African Ebola epidemic";
        }else if (year >= 2020 && year <= 2021){
            pandemic = "COVID-19";
        }else {
            pandemic = "No pandemic";
        }
        System.out.println(pandemic);

    }
}
