package Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {

        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
