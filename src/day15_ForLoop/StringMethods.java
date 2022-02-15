package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty(); //even it is space it is true

        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);
        System.out.println("------------------");
        String s1 = "CydEo";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("--------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasJava = sentence.contains("Java");//case sensitive
        System.out.println(hasJava);
        sentence.toLowerCase().contains("java");//this is a way of ignoring te case

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo"); //true
        boolean z = a.endsWith("Spoon");
        System.out.println(x);
        System.out.println(z);


    }
}
