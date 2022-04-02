package day26_CustomMethodsPractice;

public class RemoveElement {

    //removes the given index from the given array, returns a new array
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j= 0;
        for (int i=0; i < array.length; i++) {

            if (i == array[index]){
                continue;
            }
            result[j++] +=array[i];
        }
        return result;
    }
}
