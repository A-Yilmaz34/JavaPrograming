package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1= "acdb";
        String str2= "dbca";

char[] ch1 = str1.toCharArray();
char[] ch2 = str2.toCharArray();



if( Arrays.equals(ch1, ch2)){
            System.out.println("it is an anagram");
        }







    }
}
