package day05_Concatenation;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Cydeo";
        String lastName = "School";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "CYDEO";

        String fullName = firstName + " " + lastName;


        System.out.println("Full name of the person is " + fullName + " and is " + age + " years old.");

        System.out.println(fullName + " is " + 45);
// fullname is jobtitle + at +,works at + companyname


    }
}
