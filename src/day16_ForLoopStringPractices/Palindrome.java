package day16_ForLoopStringPractices;

public class Palindrome {
    public static void main(String[] args) {

     //ex: "Anna" is a palindrome.   "level", "racecar"
        String word = "rome";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }

boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);












    }
}
