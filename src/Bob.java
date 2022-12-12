import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        /** Q2 Create a class named Bob with a main method for the following exercise. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob? ");



        String answer = scanner.nextLine().trim();
        System.out.println(answer);



        if(answer.endsWith("?")) {
            System.out.println("Sure.");
        } else if (answer.endsWith("!")){
            System.out.println("Whoa, chill out!");
//            when user presses enter
        } else if (answer.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
