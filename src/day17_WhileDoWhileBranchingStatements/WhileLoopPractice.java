package day17_WhileDoWhileBranchingStatements;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {


        //username: "Cydeo"
        //password: "Cydeo123"
        Scanner scan = new Scanner(System.in);

        System.out.println("enter username");
String u = scan.next();
        System.out.println("enter password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempt = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt>0){
                if(attempt==1){
                    System.out.println("This is your last chance");
                }

                System.out.println("Incorrect info, please try again");
                System.out.println("Enter username");
                u= scan.next();

                System.out.println("Enter password:");
                p= scan.next();
                attempt--;

            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }


        }












    }
}
