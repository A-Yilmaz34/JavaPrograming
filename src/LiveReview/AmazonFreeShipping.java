package LiveReview;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalPrice = 35;

        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE.Your order total: $" + totalPrice);
        } else {
            System.out.println("NO FREE SHIPPING ELIGIBLE.Your order total: $" + totalPrice);
        }


    }
}
