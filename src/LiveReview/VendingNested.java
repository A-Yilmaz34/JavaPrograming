package LiveReview;

public class VendingNested {
    public static void main(String[] args) {

       /* selection = "drink" or can be "snack"
        drinkItem = "tea" , "coke"
        snackItem = "chips" , "candy"

        when selection is "drink":
        "drink option is selected"

        when drinkItem is "tea":
        "tea is selected"
        when drinkItem is "coke":
        "coke is selected"
        when selection is "snack"
        "snack option is selected"

        when snackItem is "chips":
        "chips item is selected"
        when snackItem is "candy":
        "candy item is selected"*/

        String selection = "drink",
                drinkItem = "coffee",
                snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");
        }
             if (drinkItem == "tea") {
            System.out.println("Tea option is selected");
             }else if(drinkItem == "coffee"){
                 System.out.println("Coffee option is selected");
             }else if(drinkItem == "coke"){
                 System.out.println("coke option is selected");
             }


        else {
            System.out.println("INVALID ENTRY");
        }


    }
}
