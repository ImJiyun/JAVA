package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args) {
        // Set: similar to list, except that it prevents duplicates
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43); // it will not be added

        // ArrayList maintains the order of insertion
        // HashSet doesn't care about the order
        // it only cares about unique values
        for (Integer value : values) {
            System.out.println(value); // 67 43 12 15
            // 43 is not being repeated
        }

        HashSet<String> strings = new HashSet<String>();
        strings.add("Random");
        strings.add("Animal");
        strings.add("People");
        strings.add("Random");
        strings.add("Random");

        for (String string: strings) {
            System.out.println(string); // Random is inserted only once, order is not maintained
        }

        // HashSet with maintaining the insertion order (duplicates are not allowed)
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.add(12);
        numbers.add(43);
        numbers.add(15);
        numbers.add(67);
        numbers.add(43);

        for (Integer number: numbers){
            System.out.println(number); // 12 43 15 67
        }

        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 8);
        Animal animal3 = new Animal("Bird", 3);
        Animal animal4 = new Animal("Dog", 12); // animal1 and animal4 are repeated
        Animal animal5 = new Animal("Kangaroo", 24);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animal1.equals(animal4)); // true with overriding equals method

        // the hash codes of two animals are not same when hashcode method is not overriden
        System.out.println(animal1.hashCode()); // 495053715
        System.out.println(animal4.hashCode()); // 2093176254

        // at first, HashSet doesn't recognize animal1 and animal4 as the objects with the same fields
        // with only overriding equals method (not included hashCode method), it still doesn't recognize
        // The point of HashSet is to ensure unique values
        // HashSet goes by hash code
        // if hash codes of two objects are same, only then it prevents duplicates
        // hash codes are values that HashSet uses to ensure uniqueness for user-defined objects
        // we need to override hashcode method from object class
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
