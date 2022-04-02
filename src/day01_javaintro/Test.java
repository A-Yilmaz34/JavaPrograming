package day01_javaintro;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        String str= "Wooden Spoon";

        StringUtility.printEachChar(str);

         str =StringUtility.reverse(str);
        System.out.println(str);

        System.out.println(StringUtility.removeDuplicates("aaaaaabbbbbbcccccc"));

        System.out.println("-------------");

        int[] arr={1,2,3,4,5};
        ArraysUtility.printEach(arr);

        System.out.println(ArraysUtility.max(arr));
        System.out.println("----------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1= ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);
        System.out.println("------------");


        int[] arr4 = ArraysUtility.removeElement(arr,1);

        System.out.println(Arrays.toString(arr4));




        String[] arrr = {"A", "B", "c"};
        String[] arrr2 = {"d", "e", "f"};

        String[] result = ArraysUtility.merge(arrr, arrr2);
        System.out.println(Arrays.toString(result));

        System.out.println();     String[] r= ArraysUtility.replace(arrr,1,"asd");






    }
}
