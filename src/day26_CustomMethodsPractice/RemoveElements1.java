package day26_CustomMethodsPractice;

public class RemoveElements1 {

    public static void main(String[] args) {

    }



    public static int[] removeElement(int[] array, int index){
        int[] result = new int[array.length-1];

        int j=0;
        for (int each : array) {
            if (each == array[index]){
                continue;
            }
            result[j++] = each;
        }

return result;

    }







}
