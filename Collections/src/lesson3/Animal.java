package lesson3;

import java.util.Objects;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // comparing the values of the fields with objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    // hash code is a random number generated based on the fields of an instance
    // if the fields of two instances have the same names, the hash codes are same
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
