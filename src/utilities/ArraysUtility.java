package utilities;

import javax.swing.*;
import java.util.Arrays;

public class ArraysUtility {

    //prints each int of an int array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number for integer Array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the minimum number for a int array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array, returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)){
                result = true;
            }
        }
        return result;
    }




    //returns the frequency of teh given element from the given array
    public static int frquencyOfElement(int[] array, int element){
        int count= 0;
        for (int each : array) {
            if (each == element)
                count++;
        }
        return count;

    }
    public static int frquencyOfElement(double[] array, double element){
        int count= 0;
        for (double each : array) {
            if (each == element)
                count++;
        }
        return count;

    }
    public static int frquencyOfElement(char[] array, char element){
        int count= 0;
        for (char each : array) {
            if (each == element)
                count++;
        }
        return count;

    }
    public static int frquencyOfElement(String[] array, String element){
        int count= 0;
        for (String each : array) {
            if (each.equals(element))
                count++;
        }
        return count;

    }



    //adds the given int element to the given array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];
        int i=0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i=0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];
        int i=0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i=0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }



    //returns the unique elements of an array as a new array
    public static int[] uniqueElements (int[] array){
        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frquencyOfElement(array,each) == 1){ //if the refuency is 1 the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    public static double[] uniqueElements (double[] array){
        double[] result = {};

        for (double each : array) {

            if (ArraysUtility.frquencyOfElement(array,each) == 1){ //if the frecuency is 1 the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    public static char[] uniqueElements (char[] array){
        char[] result = {};

        for (char each : array) {

            if (ArraysUtility.frquencyOfElement(array,each) == 1){ //if the frecuency is 1 the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    public static String[] uniqueElements (String[] array){
        String[] result = {};

        for (String each : array) {

            if (ArraysUtility.frquencyOfElement(array,each) == 1){ //if the frecuency is 1 the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }



    //removes the given index from the given array, returns a new array
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j= 0;
        for (int i=0; i < array.length; i++) {

            if (i == index){
                continue;
            }
            result[j++] +=array[i];
        }
        return result;
    }
    public static double[] removeElement(double[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        double[] result = new double[array.length-1];

        int j= 0;
        for (int i=0; i < array.length; i++) {

            if (i == index){
                continue;
            }
            result[j++] +=array[i];
        }
        return result;
    }
    public static char[] removeElement(char[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        char[] result = new char[array.length-1];

        int j= 0;
        for (int i=0; i < array.length; i++) {

            if (i == index){
                continue;
            }
            result[j++] +=array[i];
        }
        return result;
    }
    public static String[] removeElement(String[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        int j= 0;
        for (int i=0; i < array.length; i++) {

            if ( i == index){
                continue;
            }
            result[j++] +=array[i];
        }
        return result;
    }



    //merge the given twoo arrays and returns a new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result , each);
        }
        for (int each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};

        for (double each : arr1) {
            result = addElement(result , each);
        }
        for (double each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result = addElement(result , each);
        }
        for (char each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result = addElement(result , each);
        }
        for (String each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }



    //reverse the array , returns a new array
    public static int[] reverse(int[] array) {

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;


    }
    public static double[] reverse(double[] array) {

        double[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;


    }
    public static char[] reverse(char[] array) {

        char[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;


    }
    public static String[] reverse(String[] array) {

        String[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;


    }



    //replaces the the given index of an array with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }
    public static double[] replace(double[] array, int index, double newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }
    public static char[] replace(char[] array, int index, char newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }
    public static String[] replace(String[] array, int index, String newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

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
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }


    //removes Duplicates in an array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
               result=  ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
               result =  ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
              result =  ArraysUtility.addElement(result, each);

            }

        }
        return result;

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
