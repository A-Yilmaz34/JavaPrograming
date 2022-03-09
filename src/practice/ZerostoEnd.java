package practice;
import java.util.Arrays;
public class ZerostoEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0, 7}; // 10, 5, 0, 1, 0, 7, 0 ; 10, 5, 1, 0, 7, 0, 0 ; 10, 5, 1, 7, 0, 0, 0

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                for (int j = i; j < array.length-1; j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }

        System.out.println(Arrays.toString(array));







    }
}
