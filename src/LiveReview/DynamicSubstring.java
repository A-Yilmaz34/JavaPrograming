package LiveReview;

public class DynamicSubstring {
    public static void main(String[] args) {

        String searchResult = "result count:12345";
        searchResult = searchResult.substring(12);
        System.out.println("searchResult = " + searchResult);

        String today= "I coded a lot of [java] today";
        today =today.substring(today.indexOf("[")+1, today.indexOf("]"));
        System.out.println(today);










    }
}
