import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

// TODO What happens when you run the following code? Why is Arrays.toString necessary?

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------");

        // If printing without changing arrays to string, we just get the location of the said array.

// TODO Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person [] people = new Person[3];
        people[0] = new Person("Willie");
        people[1] = new Person("Vince");
        people[2] = new Person("Ozzie");

//        Add new person?
        Person tommy = new Person("Tommy");
        people = addPerson(people, tommy);



        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("---------------------");
    }

    // TODO Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length +1);
        people[array.length] = newPerson;
        return people;

    }
}