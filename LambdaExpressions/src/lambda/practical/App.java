package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

//        printCarsPriceRange(cars, 18000, 22000);
//        printCarByColor(cars, "Red");

        System.out.println("Printing cars between price 18000 and 22000");

        /*
        // anonymous class definition
        printCars(cars, new Condition<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getPrice() >= 18000 && car.getPrice() <= 22000;
            }
        });

        System.out.println("Printing cars that are red");

        printCars(cars, new Condition<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Red");
            }
        });

         */

        // using lambda
        System.out.println("Printing cars between price 18000 and 22000");

        printCars(cars, (car) -> car.getPrice() >= 18000 && car.getPrice() <= 22000);

        System.out.println("Printing cars that are blue");

        printCars(cars, (car) -> car.getColor().equals("Blue"));

        // Function: functional interface. Java provides it for us
        Function<Car, String> priceAndColor = c -> "price = " + c.getPrice() + " color = " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);


    }

    // instead of having two methods(printCarsPriceRange, printCarByColor)
    // we can live up behavior to the client using lambda
    // using one method, we're dealing with two different implementations
    /*
    public static void printCars(List<Car> cars, Condition<Car> condition) {
        for (Car c: cars) {
            if (condition.test(c)) {
                c.printCar();
            }
        }
    }
    */

    // Predicate package: we don't have to define own interfaces. it has functional interfaces
    public static void printCars(List<Car> cars, Predicate<Car> predicate) {
        for (Car c: cars) {
            if (predicate.test(c)) {
                c.printCar();
            }
        }
    }


    /*
    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        for(Car c: cars) {
            if(low <= c.getPrice() && c.getPrice() <= high) {
                c.printCar();
            }
        }
    }


    public static void printCarByColor(List<Car> cars, String color) {
        for(Car c: cars) {
            if(c.getColor().equals(color)) {
                c.printCar();
            }
        }
    }
    */

}
