package day14_StringContinue;

public class EmailAddressDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".c"));

        System.out.println("domain = " + domain);

        System.out.println("----------------------");


        String str1= "Java is fun, Java is cool";

        String s1 = str1.substring(0, 11);

        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);









    }
}
