import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//    addition(3.4,4.4);
//    subtraction(4,5);
//    multiplication(6,7);
//    division(9,3);
//    modulus(11,4);
    chooseNumber(1, 10);
    factorial();


    }

        /** Q1 Basic Arithmetic */
        public static void addition (double x, double y){
            System.out.println(x + y);
        }

        public static void subtraction (double x, double y){
            System.out.println(x - y);
        }

        public static void multiplication (double x, double y){
            System.out.println(x * y);
        }

        public static void division (double x, double y) {
            System.out.println(x / y);
        }

        public static void modulus (double x, double y){
            System.out.println(x % y);
        }

        /** Q2 Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range. */


        public static int chooseNumber (int min, int max) {

            int userAnswer;
            int loopCount = 0;

            do {

                if (loopCount > 0 ) {
                    System.out.println("out of range, try agan: " );
                }
                Scanner typeSomething = new Scanner(System.in);
                System.out.println("Enter a number between " + min + " and " + max); // 👈 this is what will prompt the user to enter something
                String userInputNum = typeSomething.nextLine();
                userAnswer = Integer.parseInt(userInputNum);

                loopCount++;

            } while (userAnswer < min || userAnswer > max);
            return userAnswer;
        }


        /** Q3 Calculate the factorial of a number. */

        public static void factorial () {

            Scanner scanner = new Scanner(System.in);
            System.out.println("pick between 1-10");
            int input = scanner.nextInt();
            System.out.println("you choose " + input);
            System.out.println("Do you want to continue? ");
            String answer = scanner.next();

            if (answer.equals("yes")) {
                int sum = 1;
                for (int i = 1; i <= input; i++) {
                    sum *= i;
                    System.out.println(sum);
                }

            }

        }

}
