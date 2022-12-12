package grades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        Student Joe = new Student("Joe", new ArrayList<>());
        Joe.addGrade(90);
        Joe.addGrade(60);
        Joe.addGrade(90);

        Student Nick = new Student("Nick", new ArrayList<>());
        Nick.addGrade(90);
        Nick.addGrade(60);
        Nick.addGrade(90);


        Student Luis = new Student("Luis", new ArrayList<>());
        Luis.addGrade(90);
        Luis.addGrade(60);
        Luis.addGrade(90);

        Student Terry = new Student("Terry", new ArrayList<>());
        Terry.addGrade(90);
        Terry.addGrade(60);
        Terry.addGrade(90);

        HashMap<String, Student> students = new HashMap<>();


        students.put("Joe22", Joe);
        students.put("Nick55", Nick);
        students.put("Luis44", Luis);
        students.put("Teryy11", Terry);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");

        while (true) {

            System.out.println("\n Here are GitHub usernames of our students: \n");

            for (Map.Entry<String, Student> set : students.entrySet()) {
                System.out.println("|" + set.getKey() + "|");
            }

            System.out.println("\n\n What student would you like to see more info on? (Case Sentitive)");
            System.out.println("\n>");
            String userInput = sc.nextLine();

            if (!students.containsKey(userInput)) {
                System.out.println("\nSorry, no student found with the GitHub username of " + userInput);
            }else {
//          else prints name/github username and prints average grade
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println(students.get(userInput).getGradeAverage());
            }

            System.out.println("\nWould you like to see another students?");
            System.out.println("\n>");
            userInput = sc.nextLine();

            if ((!userInput.equalsIgnoreCase("y")) && (!userInput.equalsIgnoreCase("yes"))) {
                System.out.println("\nGoodbye, and have a wonderful day!");


                System.exit(0);
            }





        }

















    }




}
