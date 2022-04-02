package practice;

import java.util.Arrays;

public class maxNumber {
    public static void main(String[] args) {

        int[] numbers={0,2,1,5,7,4};
        int max = numbers[0];

        Arrays.sort(numbers); //{
        System.out.println(numbers[numbers.length-1]);
       /* for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max= numbers[i];
            }
        }
        System.out.println(max);*/

    }
}
