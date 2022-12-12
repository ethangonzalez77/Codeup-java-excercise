package util;

import java.util.Scanner;

public class Input {
        private Scanner sc;

        public Input() {
                this.sc = new Scanner(System.in).useDelimiter("\n");
        }

        //  Get string method asks for the user input and returns it
        public String getString(String prompt) {
                System.out.println(prompt);
                return sc.nextLine();
        }

        //  yesNo method asks the user if they want to continue y/yes = true, else false.
        public boolean yesNo() {
                String input = sc.next();
//        System.out.println(input);
                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                        return true;
                } else {
                        return false;
                }
        }

        public int getInt(int min, int max) {
                int userInt = sc.nextInt();
                if (userInt >= min && userInt <= max) {
                        return userInt;
                } else {
                        System.out.println("Incorrect, Enter a whole number between:  " + min + " " + "and " + max);
                        return getInt(min, max);
                }
        }

        public int getNum() {
                int userInt = sc.nextInt();
                System.out.println("You entered " + userInt);
                return userInt;
        }

        public double getDouble(double min, double max) {
                double userInt = sc.nextDouble();
                if (userInt >= min && userInt <= max) {
                        return userInt;
                } else {
                        System.out.println("Incorrect, Enter a \"Double\" number  between:  " + min + " " + "and " + max);
                        return getDouble(min, max);
                }
        }

        public double getDbl() {
                double userInt = sc.nextDouble();
                System.out.println("You entered " + userInt);
                return userInt;
        }

        public String getString() {
                return sc.nextLine();
        }

        public int getInt() {
                try {
                        return Integer.parseInt(getString());
                } catch (NumberFormatException e) {
                        System.out.println("Incorrect type entered, please use an Integer");
                        return getInt();
                }
        }

        public double getDouble() {
                try {
                        return Double.parseDouble(getString());
                } catch (NumberFormatException e) {
                        System.out.println("Incorrect type entered, please use a Double");
                        return getDouble();
                }
        }



}

