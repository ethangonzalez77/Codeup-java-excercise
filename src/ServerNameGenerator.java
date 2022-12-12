public class ServerNameGenerator {

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println("....", randomElement(nouns), randomElement(adjectives));




    }



    public static String[] adjectives = {

            "alive",
            "annoying",
            "attractive",
            "alert",
            "agreeable",
            "aggressive",
            "adventurous",
            "adorable";
            "small",
            "clever"

    };

    public static String[] nouns = {

            "planet",
            "plastic",
            "Queen",
            "squadron",
            "Helicopter",
            "Animal",
            "animal",
            "ambulance",
            "airport",
            "Actor",
            "Advertisement"

        };


    public static String randomElement (String[] array) {

            int randomIndex = new Random().nextInt(array.length);
            return [randomIndex];

        }






}
