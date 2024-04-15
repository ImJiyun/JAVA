package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        // for loop
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i)); // get i index of list
        }

        // for each loop
        // data type, collections
        for (String animal: animals) {
            System.out.println(animal);
        }

        // both ArrayList and LinkedList implements List interface
        // Because they are all List, we can write List instead of ArrayList and LinkedList
        List<Vehicle> vehicles = new LinkedList<>(); // it creates size of 10 by default
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeap", "Wrangler", 25000, true));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

        printElements(animals);
        printElements(vehicles);
    }

    public static void printElements(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}
