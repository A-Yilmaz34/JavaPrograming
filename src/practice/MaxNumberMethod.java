package practice;

public class MaxNumberMethod {
    public static void main(String[] args) {

    }


    public static int[] maxNumber(int[] arr){
        int max = arr[0];
        for (int each : arr) {
            if(each>max){
                max = each;
            }
        }
        return new int[]{max};
    }
    public static int minNumber(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i <=0; i--) {
            result[j++]= arr[i];
        }
return result;

    }

    public static int[] mergeArray(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];
        int i =0;
        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }

}

