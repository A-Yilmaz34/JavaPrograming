package practice;

import java.util.Arrays;

public class Task22_2 {
    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"} , {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"} , {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

      /*  1. print the following output: (add \t between two words)
        Apple    Banana   Grape    Avocado   Paper Towels     Toilet Papers
        Tissues    Diapers
        Coke   Fanta   Arizona Tea   Pepsi
                Water*/
        String words= "";
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {

                 words += items[i][j]+"\t";
            }
        }
        System.out.print(words);
        System.out.println("---------------");

     /*   2. print the following output: (add \t between two words)
        Avocado   Grape    Banana    Apple
        Diapers   Tissues   Toilet Papers
        Paper Towels
        Water    Pepsi    Arizona Tea    Fanta
                Coke*/
        String words2="";
        for (int i = 0; i < items.length; i++) {
            for (int j =items[i].length-1; j >=0 ; j--) {

                words2 += items[i][j]+"\t";
            }
        }
        System.out.print(words2);
        System.out.println("------------------");
      /*  3. print the following output: (add \t between two words)
        Coke   Fanta   Arizona Tea   Pepsi
                Water
        Paper Towels     Toilet Papers
        Tissues    Diapers
        Apple    Banana   Grape    Avocado*/
        String words3="";
        for (int i =items.length-1 ; i >=0 ; i--) {
            for (int j =0; j < items[i].length ; j++) {

                words3 += items[i][j]+"\t";
            }
        }
        System.out.print(words3);








    }
}
