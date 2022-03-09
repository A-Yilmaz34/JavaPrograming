package day21_ArrayUtilityForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int nums[]= {10,20,30,40,50,60};

        double sum =0;

        for (int num : nums) {
            sum+=num;
        }
        double average = sum/ nums.length;
        System.out.println("average: "+average);






    }
}
