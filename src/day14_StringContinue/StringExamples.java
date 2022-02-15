package day14_StringContinue;

public class StringExamples {
    public static void main(String[] args) {


        //trim()
        String str1 = ("      batch    25     ");
        str1 = str1.trim();//"batch    25"
        System.out.println("str1 = " + str1);

        //indexOf()
        String str2 = "Cydeo School";
        int  n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //if the character is not unique! gives the first one's
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a ");//ı used space to make it clear that it is second "a"
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");//gives the first g index
        System.out.println("n4 = " + n4);

        //lastIndexOf() reads from right to left.
        System.out.println(str3.lastIndexOf("a"));






    }
}
