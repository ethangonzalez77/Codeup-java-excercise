package movies;

import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {

        Input mInfo = new Integer();
        boolean result;
        do {
            Input test = new Input();


            System.out.println("Make a number\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view animated movies");
            System.out.println("3 - view dramatic movies");
            System.out.println("4 - view scary movies");
            System.out.println("5 - view scifi movies");
            System.out.println("6 - view comedy movies\n");

            int choice = test.getInt(0,6);

            if (choice == 0) {
                System.out.println("Bye, bye \uD83D\uDC4B");
                System.exit(0);
            }else if (choice == 1) {
                for (int i = 0; i < movies.length; i++) {
                    System.out.println("Title: " + movies[i].getName() + " || Category: " + movies.getCategory());
                }
            }else if (choice == 2) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("Drama")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    }
                }
            }else if (choice == 3) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    }
                }
            }else if (choice == 4) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("comedy")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    }
                }
            }else if (choice == 5) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    }
                }
            }
            System.out.println("Do you want another choice? (Y/N)");
            result = cInfo.yesNo();
        }while (result);
        System.out.println("Bye, Bye \uD83D\uDC4B");
    }
}
