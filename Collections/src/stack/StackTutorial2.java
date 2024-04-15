package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackTutorial2 {
    public static void main(String[] args) {
        Stack<Car> cars = new Stack<>();
        cars.push(new Car("Nissan", 2010));
        cars.push(new Car("Toyota", 2001));
        cars.push(new Car("Honda", 1997));
        cars.push(new Car("Ford", 2005));

        System.out.println("print the cars");
        for (Car car: cars) {
            System.out.println(car);
        }

        System.out.println("remove the cars");
        int size = cars.size();
        for (int i = 0; i < size; i++) {
            System.out.println(cars.pop());
        }


        cars.push(new Car("Hyundai", 1982));
        cars.push(new Car("Audi", 2009));
        cars.push(new Car("BMW", 1994));
        cars.push(new Car("Volkswagen", 2003));

        System.out.println("print the new cars");
        System.out.println("Before sorting: ");
        for (Car car: cars) {
            System.out.println(car);
        }

        System.out.println("After sorting by production year");
        CarComparator carComparator = new CarComparator();
        ArrayList<Car> carList = new ArrayList<>(cars);
        Collections.sort(carList, carComparator);

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
