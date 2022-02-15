package day14_StringContinue;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, ı love learning Java";
        String str2 = str.replace("Java","Python");

        System.out.println("str2 = " + str2);

String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
String sentence2 = sentence.replace("Python", "").replace("   "," ");

        System.out.println("sentence2 = " + sentence2);

String s3 = "Java";

s3 =s3.replace("a", "e");
        System.out.println("s3 = " + s3);



    }
}
