import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

    Person[] people = new Person[3];
    people[0] = new Person("john");
    people[1] = new Person("ronn");
    people[2] = new Person("erin");

    people = addPerson(people, new Person("sam"));
    for (Person newPers: people) {
        System.out.println(newPers.getName());
    }



    }

    public static Person[] addPerson(Person[] people, Person person) {

        Person[] addingPerson = Arrays.copyOf(people, people.length + 1);

        addingPerson [addingPerson.length - 1] = person;

        return addingPerson;
    }











}
