package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#      $%WoodenSpoon";

        String digits = "", // 1234....
                letters = "",
                specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // each character

            if(ch>='0' && ch<='9'){
                digits+=ch;
            }else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                letters+=ch;
            }else {
                if(ch!=' '){   //removes the spaces
                    specialChars+=ch;

                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
