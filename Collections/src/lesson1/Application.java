package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        // collections : group of items
        // array can be used to store the similar values together
        // the size of array cannot be changed once it's been created (fixed-size structure
        // arraylist: a resizable array
        // it's better to put one particular data type in arraylist (to have type safety)
        // we can use arraylist without declaring data type but..
        // inside the brackets, put data type
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello"); // add it to the arraylist
        words.add("there");
        words.add("10");


        String item1 = words.get(0); // get the index position, it's going to return object
        String item2 = words.get(1);
        String item3 = words.get(2);
        words.remove(0); // remove the first index of position
        // words.removeFisrt(); // remove the first index of position

        // We can not put primitive data type inside brackets (but only reference type)
        // primitive data type doesn't associated with a class
        // String is associated with String class (it's reference data type)
        // Integer is a wrapper class
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100); // only integer can be added
        numbers.add(200); // only integer can be added
        numbers.add(45); // only integer can be added
        numbers.add(1000); // only integer can be added
        numbers.remove(2);

        for (int number: numbers) {
            System.out.println(number);
        }
        // arraylist and linkedlist works exactly the same
        // arraylist uses an array in the implementation (resizable array)
        // linkedlist uses node objects (bunch of nodes that are linked together)

        // the default starting size of the array is 10 slots
        // as soon as we try to put 11 items, it's gonna create a new array of size 20
        // and copy all elements in the older array, the 10 slots
        // when trying to put elements more than existing the number of slots,
        // it's going to double the size (when putting 21st elements, it's creating 40 slots)

        // when we need more data, linked list attaches a new node at the end

        // linked list is better for manipulating data
        // when removing the data from the beginning of array list,
        // all item that follows need to copied back to 0 index position

        // linked list uses a doubly linked list data structure

        // arraylist is faster for retrieving data
        // we just give the index position and there is no traversal
        // in linked list, it would have to be traversed completely to find particular element

        // linked list is faster for manipulation, but slower for retrieval
        // arraylist is faster for retrieval, but slower for manipulation

    }
}
