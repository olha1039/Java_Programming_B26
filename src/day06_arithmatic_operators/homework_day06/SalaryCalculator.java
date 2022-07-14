package day06_arithmatic_operators.homework_day06;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
         */

         double salary = 100_000, stateTaxRate = 0.08, federalTaxRate = 0.21;
         double stateTax = salary * 0.08;
         double federalTax = salary * 0.21;
         double totalTax = stateTax + federalTax;
         double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);


    }
}
