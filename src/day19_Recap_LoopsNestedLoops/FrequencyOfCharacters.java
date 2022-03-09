package day19_Recap_LoopsNestedLoops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {
            

        
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) { //find the frwquency of each character

            char each = str.charAt(i); //each characters of str
            if(ch==each){
                count++;
            }

            }
        if(result.contains(""+ch)){
            continue;
        }
        result+=ch;
        result+=count;
        }








    }
}
