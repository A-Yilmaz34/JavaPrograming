package day24_CustomMethodsReturn;

public class ReturnMethodPractice {
    public static void main(String[] args) {
int max_number = max(100, 200);

        System.out.println(max_number);

        int multiplication = max_number*2;


    }

public static int max(int a, int b){
        int result = 0;
        if (a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
}






}
