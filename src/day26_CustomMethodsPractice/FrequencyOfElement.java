package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,1,2,2,2,1,1,1};

int n = frquencyOfElement(arr, 1);
        System.out.println(n);

        String[] str= {"asdas","a","a"};
        System.out.println(frquencyOfElement(str,"a"));

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

    //returns the frequency of teh given element from the given array
    public static int frquencyOfElement(double[] array, double element){
        int count= 0;
        for (double each : array) {
            if (each == element)
                count++;
        }
        return count;

    }

    //returns the frequency of teh given element from the given array
    public static int frquencyOfElement(char[] array, char element){
        int count= 0;
        for (char each : array) {
            if (each == element)
                count++;
        }
        return count;

    }

    //returns the frequency of teh given element from the given array
    public static int frquencyOfElement(String[] array, String element){
        int count= 0;
        for (String each : array) {
            if (each.equals(element))
                count++;
        }
        return count;

    }






}
