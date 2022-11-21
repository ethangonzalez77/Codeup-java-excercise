import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        /** Q2 Create a class named Bob with a main method for the following exercise. */

        Scanner typeSomething = new Scanner(System.in);
        System.out.println("GO tell Bob something that ends with a \"!\", \"?\", any word, or say nothing");//👈 prompts user
        String userInput = typeSomething.nextLine();




        if (userInput.endsWith("?")) {
            System.out.println("Sure....");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.startsWith(" ") || userInput.endsWith(" ") || userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever...");
        }



    }
}
