import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
//        makes a copy of people array increases by 1
        Person[] addingPerson = Arrays.copyOf(people, people.length +1);
//        gets the index of the last person
        addingPerson[addingPerson.length - 1] = person;
//        returns an array with a last index with a string of "sam"
        return addingPerson;
    }

    //    main method
    public static void main(String[] args) {

//        array that holds 3 people
        Person[] people = new Person[3];
        people[0] = new Person("john");
        people[1] = new Person("ronn");
        people[2] = new Person("erin");

//        static method
//        enhanced for loop to iterate over person
        people = addPerson(people, new Person("sam"));
        for(Person newPer: people){
            System.out.println(newPer.getName());
        }
    }

}
