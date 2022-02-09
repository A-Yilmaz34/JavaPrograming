package day11_SwitchStatements;

public class SalaryCalculator2 {
    public static void main(String[] args) {
        int hourlyRate = 65;
        int weeklyHours = 40;

        double stateTaxRate = 0,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;






    }
}
