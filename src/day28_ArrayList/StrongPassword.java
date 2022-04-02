package day28_ArrayList;

import utilities.ArraysUtility;

public class StrongPassword {
    public static void main(String[] args) {

       String password = "Cydeo1990@";

       boolean r1 = password.length() >=8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lowercase
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit


        char[] result = password.toCharArray();

        for (char each : result) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else{ //special character
                r4=true;
            }
        }

       /* if (r1 && r2 && r3 && r4 && r5){
            System.out.println("the password is strong");
        }else
            System.out.println("the password is NOT strong");
*/
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

        System.out.println(ArraysUtility.isStrongPassword("adfEE23"));

    }
    //checks if a password is strong, returns boolean
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >=8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lowercase
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit


        char[] result = password.toCharArray();

        for (char each : result) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else{ //special character
                r4=true;
            }
        }

       /* if (r1 && r2 && r3 && r4 && r5){
            System.out.println("the password is strong");
        }else
            System.out.println("the password is NOT strong");
*/
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        return isStrongPassword;
    }


}
