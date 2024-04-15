package stack;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.getProudctionYear(), o1.getProudctionYear()); // descending order
    }
}
