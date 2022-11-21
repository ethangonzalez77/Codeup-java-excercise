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


//            System.out.println("You choose int: " + user);
            System.out.println("Would you like to continue? ");


            for (int i = 0; i < 10; i++) {


            }




        }




        /** Q4 Create an application that simulates dice rolling. */


        /** Q5 Game Development 101 */
}
