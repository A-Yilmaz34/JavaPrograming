package day17_WhileDoWhileBranchingStatements;

public class FrequencyOfWordWithWhile {
    public static void main(String[] args) {

        String sentence = "cat cat catc at cat cat cat dog dog catcat";
        int countCat =0;

        while (sentence.contains("cat")){
            sentence= sentence.replaceFirst("cat", "");
                    countCat++;
        }
        System.out.println(countCat);

        System.out.println("------------------");

        String s= "java java java python python python";

        int countJava =0;
        int countPython =0;

        while (s.contains("java") ||s.contains("python")){
            if (s.contains("java")){
                s= s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("python")){
                s= s.replaceFirst("python", "");
                countPython++;
            }
        }

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);





    }
}
