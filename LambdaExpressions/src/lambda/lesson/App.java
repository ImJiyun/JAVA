package lambda.lesson;

public class App {
    public static void main(String[] args) {
        // method is not independent of class
        // functional programming: allow method to exist independently (introduced in Java 8)
        // blocks of code don't need to be wrapped inside of method belonging to a class
        // we can pass blocks of code as arguments to methods of an object
        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        // walker expects an instance of class that implements lesson1.Walkable
        // instead of creating an instance of class first, we can create a new object
        // inside of walker method, we created an implementation of lesson1.Walkable
        // it is not tied to any class definition
        /*
        walker(new lesson1.Walkable() {
            @Override
            public void walk() {
                System.out.println("Custom object walking...");
            }
        });

         */
        // lambda expression
        // a shortened version of anonymous class definition
        // focus on behavior
        walker(() -> System.out.println("Custom object walking..."));
        // inside the walker method is an implementation of lesson1.Walkable interface
        // an anonymous implementation of an abstract method listed in a functional interface

        // target type of conversion must be an interface
        // variable type of expression must be a functional interface
        // functional interface is an interface with only one abstract method in it
        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking...");
            System.out.println("the object tripped");
        };

        // inside the walker method, there is a lambda expression, which is an implementation of lesson1.Walkable interface
        // lesson1.Walkable is a functional interface

        walker(aBlockOfCode);
        // if the interface that method accepts as an argument is not a functional interface, we cannot use lambda expression

        // lambda expressions:  blocks of code used to implement a method defined by a function interface

        // convert sayHello function to a lambda expression
        ALambdaInterface helloVar = () -> System.out.println("hello there");

        helloVar.someMethod();

        // convert sum function to a lambda expression
        // inside lesson1.Walkable and lesson1.ALambdaInterface interface methods don't return anything.
        // so it cannot be type of sumVar
        // method signature should match
        Calculate sumVar = (a, b) ->  a + b;

        // use sumVar
        System.out.println(sumVar.compute(4, 6));

        // convert nonZeroDivide to a lambda expression
        Calculate nonZeroDivider = (a, b) -> {
            if (a == 0) return 0;
            return a / b;
        };

        System.out.println(nonZeroDivider.compute(4, 2));

        // convert reverse method to a lambda expression
        StringWorker reverser = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;

        };

        System.out.println(reverser.work("Vehicle"));

        // convert factorial function to a lambda expression
        NumberWorker computedNumber = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(computedNumber.compute(10));

        // lambdas allow us to disassociate a set of instructions from an object
        // they allow us separation of behavior from an object

        // using generic interface - using one interface
        MyGenericInterface<String> reverser2 = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;

        };
        System.out.println(reverser2.work("Hello World"));

        MyGenericInterface<Integer> computedNumber2 = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(computedNumber2.work(10));


    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return (arg1 / arg2);
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >=0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = 1 * result;
        }
        return result;
    }
}