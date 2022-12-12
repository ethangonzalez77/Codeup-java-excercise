package grades;
import java.util.ArrayList;
public class StudentTest {

    public static void main(String[] args) {

        Student ethan = new Student("ethan", new ArrayList<>());

        ethan.addGrade(100);
        ethan.addGrade(80);
        ethan.addGrade(60);
        ethan.addGrade(60);


        System.out.println(ethan.getGradeAverage());



    }



}
