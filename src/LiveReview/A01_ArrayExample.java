package LiveReview;

import java.util.Arrays;

public class A01_ArrayExample {
    public static void main(String[] args) {

        int code= 200;
        int [] codes =new int[8]; //my codes array holds 8 integer elements

        System.out.println(Arrays.toString(codes));

        codes[0] = 200;
        codes[1] = 201;

        int[] statusCodes= {200,201,204,400,401,403,404,500};

        System.out.println("---------size of an array-----------");
        System.out.println("the sze of the array: "+statusCodes.length);

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden", "Not Found","Internal Server Error"};

        for (int i = 0; i < responseTypes.length; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each status code means = "+text);
        }



    }
}
