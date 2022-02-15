package day14_StringContinue;

import java.security.SecureRandom;

public class StringMethod3 {
    public static void main(String[] args) {

        String word = "cydeo School";
//substring is a portion of the statement
        word = word.substring(1);
        System.out.println("word = " + word);

        word = word.substring(0,5);
        System.out.println("word = " + word);

        word = word.substring(3);
        System.out.println("word = " + word);


String word2 = "Java Programming Language";

        String s1; //Java
        String s2; //Programming
        String s3; //Language

s1 = word2.substring(0, word2.indexOf(" "));
s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
s3 = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }
}
