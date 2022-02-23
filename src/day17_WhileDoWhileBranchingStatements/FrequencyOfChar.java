package day17_WhileDoWhileBranchingStatements;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "AAABBBC";
        
        char ch ='A';
        
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { //i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str
            if(eachChar == ch){
                frequency++;
            }
        }
        System.out.println(frequency);














    }















}
