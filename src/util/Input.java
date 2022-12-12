package util;
import java.util.Scanner;

public class Input {

        private Scanner userScan;

        public Input () {
                this.userScan = new Scanner(System.in).useDelimiter("\n");
        }

        public String getString (String question) {
                System.out.println(question);
                return userScan.nextLine();
        }

        public boolean yesNo () {
                String input = userScan.next();

                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                        return true;
                }else {
                        return false;
                }
        }

        public int getInt(int min, int max) {
                int userInt = userScan.nextInt();
                if(userInt >= min && userInt <= max) {
                        return userInt;
                }else {
                        System.out.println("unacceptable, select a whole number between: " + min + " " + max);
                        return getInt(min, max);
                }
        }

        public int getNum () {
                int userInt = userScan.nextInt();
                System.out.println("you number was: " + userInt);
                return userInt;
        }

        public double getDouble (double min, double max) {
                double userInt = userScan.nextDouble();
                if (userInt >= min && userInt <= max) {
                        return userInt;
                }else {
                        System.out.println("Incorrect, Enter a \"Double\" number  between:  " + min + " " + "and " + max);
                        return getDouble(min, max);
                }
        }

        public double getDbl() {
                double userInt = userScan.nextDouble();
                System.out.println("You typed " + userInt);
                return userInt;
        }

        public String getString() {
                return userScan.nextLine();
        }

        public int getInt () {
                try {
                        return Integer.parseInt(getString());
                }catch (NumberFormatException e) {
                        System.out.println("Wrong data type entered, you need to type an Integer");
                        return getInt();
                }
        }

        public double getDouble () {

                try{
                        return Double.parseDouble(getString());
                }catch (NumberFormatException e) {
                        System.out.println("Wrong data type entered, you need to type an Double");
                        return getDouble();
                }
        }






}








