package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        replaceAll(arr, 1,100);
        System.out.println(Arrays.toString(arr));

    }

    //replaces an element with a new one of an array
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
}
