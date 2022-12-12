import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/**       Q1 Loop Basics */
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 1;
//        do {
//            System.out.println( i );
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println( i );
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println( i );
//            i *= i;
//        } while (i <= 1000000);


/**       Q2 Fizzbuzz */
//        int g ;
//        for (g = 1; g <= 100; g++) {
//
//            if (g % 3 == 0 && g % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (g % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (g % 3 == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(g);
//            }
//        }


/**       Q3 Display a table of powers. */


        System.out.print("Enter and integer: ");
        int num = scanner.nextInt();
        System.out.println("Here is your table!\n" +
                "\n" +
                "number | squared | cubed\n" +
                "------ | ------- | -----");
        for(int i = 1; i <= num;   i++){
            System.out.println("" +i+"     | "+i*i+"       | "+i*i*i+"    \n");
        }






/**        Q4 Convert given number grades into letter grades. */
//        int grade = 79;
//        if(grade <= 49 && grade >= 0){
//            System.out.printf("Your grade is %s\n","F-");
//        }else if(grade <= 55 && grade >= 50) {
//            System.out.printf("Your grade is %s\n", "F");
//        }else if(grade <= 59 && grade >= 56) {
//            System.out.printf("Your grade is %s\n", "F+");
//        }else if(grade <= 62 && grade >= 60) {
//            System.out.printf("Your grade is %s\n", "D-");
//        }else if(grade <= 64 && grade >= 63) {
//            System.out.printf("Your grade is %s\n", "D");
//        }else if(grade <= 66 && grade >= 65) {
//            System.out.printf("Your grade is %s\n", "D+");
//        }else if(grade <= 70 && grade >= 67) {
//            System.out.printf("Your grade is %s\n", "C-");
//        }else if(grade <= 75 && grade >= 71) {
//            System.out.printf("Your grade is %s\n", "C");
//        }else if(grade <= 79 && grade >= 76) {
//            System.out.printf("Your grade is %s\n", "C+");
//        }else if(grade <= 82 && grade >= 80) {
//            System.out.printf("Your grade is %s\n", "B-");
//        }else if(grade <= 85 && grade >= 83) {
//            System.out.printf("Your grade is %s\n", "B");
//        }else if(grade <= 87 && grade >= 86) {
//            System.out.printf("Your grade is %s\n", "B+");
//        }else if(grade <= 91 && grade >= 88) {
//            System.out.printf("Your grade is %s\n", "A-");
//        }else if(grade <= 93 && grade >= 92) {
//            System.out.printf("Your grade is %s\n", "A");
//        }else if(grade <= 100 && grade >= 94) {
//            System.out.printf("Your grade is %s\n", "A+");
//        }else{
//            //This is not a valid grade between 0 and 100
//            System.out.println("Invalid grade value");
//        }



    }
}
