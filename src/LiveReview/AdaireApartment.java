package LiveReview;

public class AdaireApartment {
    public static void main(String[] args) {

        System.out.println("#####Welcome to Adaire Apartments######");
        int numberOfBedrooms = 3;

        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("you have selected studio apartments");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("you have selected 1 bedroom apartments");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("you have selected 2 bedroom apartments");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom apartmens not available");

        }

        System.out.println("startingPrice = $" + startingPrice);
    }
}
