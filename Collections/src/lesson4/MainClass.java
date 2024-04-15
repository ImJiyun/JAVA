package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10); // set do not contain duplicates
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);

         // convert hashset into list
         // put hashset in the argument to the constructor of ArrayList
         // it populates with data
         List<Integer> myList = new ArrayList<Integer>(hashSet);

        // sort the data
        // sort(): exists on the collection class, the argument type is a List
        // convert whatever type to a List to sort data
        Collections.sort(myList);
        System.out.println(myList); // sort data from smallest to highest
        // natural order: integers -> smallest to highest, strings -> a to z

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(new Employee("Mike", 3500, "Accounting"));
        employees.add(new Employee("Paul", 3000, "Admin"));
        employees.add(new Employee("Peter", 4000, "IT"));
        employees.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> list = new ArrayList<Employee>(employees);

        // to sort a list with user-defined class, implement the Comparable interface in the Employee class
        // we need to compare one employee with the next
        // what makes one employee larger or smaller than the other?
        // Collections.sort(list); // sort based on their salary
        EmployeeComparator employeeComparator = new EmployeeComparator();

        Collections.sort(list, employeeComparator);
        for (Employee employee: list) {
            System.out.println(employee);
        }
    }
}
