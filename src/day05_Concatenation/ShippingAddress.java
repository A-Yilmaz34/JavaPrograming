package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String  name             = "James King",
                buildingNumber  = "1123B",
                streetName      = "Jones Branch Dr",
                city            = "McLean",
                state           = "VA",
                zipCode           = "22031A";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

    }
}
