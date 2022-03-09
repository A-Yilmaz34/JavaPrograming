package practice;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "aaAbbBddjjnn";

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            String ch = (""+str.charAt(i)).toLowerCase();

            if(!(result.contains(ch))){
                result+=ch;

            }

        }

        System.out.println(result);






    }

}
