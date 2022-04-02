package practice;

public class IsEqualArray {
    public static void main(String[] args) {

        int arr1[] = {32, 20, 26, 40, 30, 25, 42, 3, 10, 50};
        int arr2[] = {3, 10, 40, 26, 50, 25, 42, 32, 20, 30};

        int count = 0; //counts the number of equalities

        // checks all elements of arr1 if they equal to any arr2 element and counts the number of equalities
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    count++;
                }
            }
        }

        //if count is equal to length of the given array means that all numbers are the same: arrays are equal
        if (count == arr1.length) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are NOT equal");
        }

    }

}
