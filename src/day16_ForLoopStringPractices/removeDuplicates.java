package day16_ForLoopStringPractices;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i < str.length(); i++) { //i represents the indexes
            String ch =""+ str.charAt(i);
            if(!result.contains(ch)){
                result+= ch;

            }
        }
        System.out.println(result);













    }
}
