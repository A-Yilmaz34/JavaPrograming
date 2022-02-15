package LiveReview;

import jdk.swing.interop.SwingInterOpUtils;

public class StringReview {
    public static void main(String[] args) {

        String str1 = "Java"; // Literal way of creating
        //it is created in the heap memory in the "String pool"

        String str2 ="Java";
        System.out.println(str1 == str2);//true beacuse both of them in teh same memory: String pool

        String str3 = new String("Java");

        System.out.println(str1==str3);

        System.out.println(str1.equals(str3));
        System.out.println("-------------------");

        String str4 = new String("JAVA");
        System.out.println(str4.equalsIgnoreCase(str1));









    }
}
