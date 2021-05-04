import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("John");
        persons[1] = new Person("Paul");
        persons[2] = new Person("James");
        System.out.println(persons[1].getName());

        for (int i = 0; i < persons.length; i += 1) {
            System.out.println(persons[i].getName());
        }

        Person brett = new Person("Brett");
        addPerson(persons, brett);

        for (int i = 0; i < addPerson(persons, brett).length; i += 1) {
            System.out.println(addPerson(persons, brett)[i].getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPersons = Arrays.copyOf(people, people.length + 1);
        newPersons[newPersons.length - 1] = person;
        return newPersons;
    }
}

