package day20_Arrays;

public class UniqueElementsArray {
    public static void main(String[] args) {

String[] words = {"Java","Java","C#","Python","Python"};

        for (int i = 0; i < words.length; i++) {

String element = words[i];
            int frequency = 0;
            for (int j = 0; j < words.length; j++) {

                if(words[j].equalsIgnoreCase(element)){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(element);
            }
        }


    }
}
