package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a; //implicit casting
        // in the background it does (short)a


//larger primitive types CANNOT be directly assigned.:

        int x = 55;
        short y = (short)x; //explicit casting

        long j = 10000000;
        short k = (short)j;

        double l = 2.5;   // decimals are ok, the same
        float m = (float)l;

        double n = 10.8;
        int s = (int)n;   //just takes the left side of the decimal

        double d1 = 20.3;
        short s1 = (short) d1;

        System.out.println(100d); // "d" prints as decimal number


        System.out.println(d1+ " : " + s1);

        System.out.println(n + " : " + s);

        System.out.println(l + " : " + m);



        System.out.println(j + ":" + k);
    }
}
