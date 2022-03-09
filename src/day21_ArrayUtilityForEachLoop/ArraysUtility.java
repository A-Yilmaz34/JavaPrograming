package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println("Min score:" + scores[0]);
        System.out.println("Max score:" + scores[scores.length - 1]);


        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("----------------");
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        System.out.println("--------------");
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a,b,c}
        Arrays.sort(ch2); //{a,b,c}

        boolean anagram = Arrays.equals(ch1,ch2); //if true they are anagram




    }
}
