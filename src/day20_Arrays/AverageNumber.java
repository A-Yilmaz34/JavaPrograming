package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {


        int nums[]= {10,20,30,40,50,60};

        int sum =0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
double averageNumber = sum/ nums.length;

        System.out.println("averageNumber = " + averageNumber);


    }
}
