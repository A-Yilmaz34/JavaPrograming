package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int [] array ={1,2,3,4,4,5,5,6,6,7,8,9        };
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));


        double [] arr ={1.3,2.4,3.6,4,4,5,5,6,6,7,8,9};

double[] uniq = ArraysUtility.uniqueElements(arr);
        System.out.println(Arrays.toString(uniq));


    }

    //finds the unique elements and returns as int array
    public static int[] uniqueElements (int[] array){
        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frquencyOfElement(array,each) == 1){ //if the refuency is 1 the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }







}
