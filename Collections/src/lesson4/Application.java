package lesson4;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);

        // merge two list together
        list1.addAll(newList); // take all data in newList and merge them into list1
        System.out.println(list1);

        list1.removeAll(newList);
        System.out.println(list1); // it removes all of 10 in list1

        // check if the particular item in the list
        boolean hasValue = list1.contains(67);
        System.out.println(hasValue); // true

        // checks if the list is empty
        boolean hasValue2 = list1.isEmpty();
        System.out.println(hasValue2); // false

        // remove everything except for the values in the argument
        boolean hasValue3 = list1.retainAll(newList); // if it deletes things it returns true
        System.out.println(hasValue3);
        System.out.println(list1);

        list1.clear(); // eliminate all data in the list1
        System.out.println(list1);


    }
}
