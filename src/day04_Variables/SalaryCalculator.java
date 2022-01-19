package day04_Variables;

import org.w3c.dom.ls.LSOutput;

public class SalaryCalculator {
    public static void main(String[] args) {


        //hourlyrate, weekly hours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);
        System.out.println("weeklyHours = " + weeklyHours);


    }


}
