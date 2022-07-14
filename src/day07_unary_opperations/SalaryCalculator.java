package day07_unary_opperations;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08;
        double fedTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * fedTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: " + stateTaxRate + ", Federal tax rate: " + fedTaxRate + " , base salary: $" + salary + "\nTax amounts: " + stateTax + " for state tax and " + federalTax + " for Federal tax, for the total amount of " + totalTax + "\nAfter tax your salary is " + salaryAfterTax;

        System.out.println(taxReport);
    }
}
