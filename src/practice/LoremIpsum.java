package practice;

import java.util.Arrays;

public class LoremIpsum {
    public static void main(String[] args) {

        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
        String evens = "", odds = "";
        int even = 0;
        int odd = 0;

        String[]words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        for (int i = 0; i < words.length; i++) {


        if (words[i].length()%2==0){
            even++;

        }else{
            odd++;
        }
    }
        System.out.println("even"+even);
        System.out.println("odd"+odd);

    }
}
