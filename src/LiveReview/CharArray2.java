package LiveReview;

import java.util.Arrays;

public class CharArray2 {
    public static void main(String[] args) {

        int [] countOfEachChar = new int [26];

        String word = "silent";
        for (char letter : word.toCharArray()) {
            countOfEachChar[letter-97] = countOfEachChar[letter-97]+1;
        }
        System.out.println(Arrays.toString(countOfEachChar));







    }
}
