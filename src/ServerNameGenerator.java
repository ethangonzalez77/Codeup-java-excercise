import java.util.Random;

public class ServerNameGenerator {

    //    main method
    public static void main(String[] args) {
        System.out.println("Here is your server name:");
//        prints out server noun and adjective
        System.out.printf("%s-%s", randomElement(nouns), randomElement(adjectives));

    }

    //    adjectives array
    public static String[] adjectives = {
            "clever",
            "small",
            "adorable",
            "adventurous",
            "aggressive",
            "agreeable",
            "alert",
            "alive",
            "annoying",
            "attractive"
    };

    //    noun array
    public static String[] nouns = {
            "Actor",
            "Advertisement",
            "Airport",
            "Ambulance",
            "Animal",
            "Helicopter",
            "Planet",
            "squadron",
            "Plastic",
            "Queen"
    };

    //    random element method
//    using random() constructor
    public static String randomElement(String[] array){
        int randomIndex = new Random().nextInt(array.length);
        return array[randomIndex];
    }

}