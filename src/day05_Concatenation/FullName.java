package day05_Concatenation;

import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 45;
        String jobTitle = "senior SDET";
        String companyName = "CYDEO";
        double salary = 100000;
        String fullName = firstName + " " + lastName;


        System.out.println("Full name of the person is " + fullName + " and is " + age + " years old.");

        System.out.println(fullName + " is " + 45);
// fullname is jobtitle + at +,works at + companyname

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is $" + salary);
    }
}
