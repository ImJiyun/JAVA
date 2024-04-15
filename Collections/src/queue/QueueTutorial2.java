package queue;

import java.util.*;

public class QueueTutorial2 {
    public static void main(String[] args) {
        Queue<Student> studentLine = new LinkedList<>();
        studentLine.offer(new Student("Alex", 12));
        studentLine.offer(new Student("James", 34));
        studentLine.offer(new Student("Cassie", 21));
        studentLine.offer(new Student("Kelly", 7));

        System.out.println("Before sorting: ");
        Iterator<Student> itr = studentLine.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("After sorting by student name");
        StudentComparator studentComparator = new StudentComparator();

        List<Student> studentList = new ArrayList<>(studentLine);
        Collections.sort(studentList, studentComparator);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
