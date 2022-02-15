package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDeo",
                lastName = "SCHOOL";

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //we made "Cydeo". other way:

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);


    }
}
