package LiveReview;

public class DiffirenceBetweenAndOrBitwiseOperators {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;

        System.out.println(true | false); //true
        System.out.println(true || false); //true but doesnt check the second part (false)

        System.out.println(false | true);

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1);









    }
}
