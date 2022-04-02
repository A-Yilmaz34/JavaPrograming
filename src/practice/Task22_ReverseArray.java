package practice;
import java.util.Arrays;
public class Task22_ReverseArray {
    public static void main(String[] args) {
       /* Write a program that can reverse a two dimensional array (return new
                array)
        Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},};*/

        int[][] array = { {1, 2, 3} , {4, 5, 6} };
        int reverse[][] = new int[2][3];
        int k = 0;

        for (int i = array.length - 1; i >= 0; i--) {
          int  l = 0;
            for (int j = array[i].length - 1; j >= 0; j--) {
                reverse[k][l] = array[i][j];
                l++;
            }
            k++;
        }

        System.out.println(Arrays.deepToString(reverse));

    }
}
