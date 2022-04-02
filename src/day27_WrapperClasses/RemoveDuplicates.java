package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String[] arr = {"a","s","s","d"};
        arr =ArraysUtility.removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr2= {1,2,2,2,2,22,3,4,5};
       arr2 =  ArraysUtility.removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));




    }




}
