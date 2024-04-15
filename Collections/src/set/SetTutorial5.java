package set;

import java.util.*;

public class SetTutorial5 {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Kelly", 26));
        employees.add(new Employee("Noah", 37));
        employees.add(new Employee("Oliver", 27));
        employees.add(new Employee("Charlotte", 31));

        System.out.println(employees);

        List<Employee> employeeList = new ArrayList<>(employees);
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}
