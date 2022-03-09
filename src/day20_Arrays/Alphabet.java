package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //26 characters
        char[] alphabet = new char[26];


        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;

        }
        System.out.println(Arrays.toString(alphabet));


    }
}
