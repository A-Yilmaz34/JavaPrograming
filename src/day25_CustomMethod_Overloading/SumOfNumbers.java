package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

       int total= sumOf2Numbers(34,33);
        System.out.println(total);

        int sum2= sumOf3Numbers(12,23,23);
        System.out.println("sum2 = " + sum2);
    }

public static int sumOf2Numbers(int num1, int num2){

        return num1+num2;
}

public static int sumOf3Numbers(int num1, int num2, int num3){
    return num1+num2+num3;

}

}
