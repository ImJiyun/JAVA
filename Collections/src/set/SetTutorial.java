package set;

import java.util.*;

public class SetTutorial {
    public static void main(String[] args) {
        // Set is a member of Java Collections Framework
        // it doesn't contain duplicate data
        Set<String> animals = new HashSet<>();
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("Chicken");
        animals.add("Horse");
        animals.add("Tiger"); // duplicates
        animals.add("Tiger");
        animals.add("Tiger");
        animals.add("Tiger");


        System.out.println(animals); // it does not maintain the insertion order

        animals.remove("Tiger");
        System.out.println(animals);

        System.out.println("Using for loop");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Using iterator");
        Iterator<String> itr = animals.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Sorting...");
        List<String> animalList = new ArrayList<>(animals);

        Collections.sort(animalList);
        System.out.println(animalList);


    }
}
