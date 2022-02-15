package day13_String;

public class StringIntro {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name3==name4);


        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3==str4);

        System.out.println(name.equals(name3));

    }
}
