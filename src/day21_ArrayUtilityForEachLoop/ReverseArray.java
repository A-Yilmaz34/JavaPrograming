package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,};

        int[] reversed = new int [numbers.length];

       /* for (int i = numbers.length-1; i >=0 ; i--) {
            reversed[i] =numbers[numbers.length-i-1];
        }*/
        int j = 0;
        for (int i = numbers.length - 1 ; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }


        System.out.println(Arrays.toString(reversed));





    }
}
