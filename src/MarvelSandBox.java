import java.util.Arrays;

public class MarvelSandBox {

    public static void main(String[] args) {

        saySomething("well hello there!");


//        sayArray(s);


        // the following below is an example of constructors
        MarvelSandBox hero1 = new MarvelSandBox("fantastic four", 4, "mr.fantastic");
        MarvelSandBox hero2 = new MarvelSandBox("avangers", 8, "iron man");

        System.out.println(hero1.teamName);
        System.out.println(hero2.teamName);
        hero1.superPowers();
// cunstructors allow us to assign each attribute to an object


    }



    String heros;
    int powerLevel;


    void attack() {/* this is a method */
        System.out.println(heros + " attack!");
    }

    static void saySomething(String input) {
        System.out.println(input);
    }


    public  void sayArray(String[] array) {
        System.out.println(array[2]);
    }
    public void sayArray() {
        String[] s = new String[] {"yoo", "how's it going?","who is your favorite X-men?"};

        System.out.println(s[2]);
    }
    // the following below is an example of constructors
    //A constructor is a special method that is called when an object is created. A constructor has the same name as the class and does not define a return type. Constructors, like any other method, can accept arguments and be overloaded.

    String teamName;
    int members;
    String teamMate;

    MarvelSandBox(String teamName, int members, String teamMate) {
//class name👆than () than {} that's it its like a method but the name of the method is the same name as the class
        //like this:
        this.teamName = teamName;
        this.members = members;
        this.teamMate = teamMate;
//       👆 basically saying hero1.teamName =

        //not like this:
        teamName = teamName;// this won't work cuz we need to assign them by "this" key word, then they will be assigned to the "hero1 object"

        members = members;
        teamMate = teamMate;

    }

    void superPowers () {
        System.out.println(this.teamName + " they have powers");
    }


}
