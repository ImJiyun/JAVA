package stack;

public class Car {
    private String make;
    private int proudctionYear;

    public Car(String make, int proudctionYear) {
        this.make = make;
        this.proudctionYear = proudctionYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getProudctionYear() {
        return proudctionYear;
    }

    public void setProudctionYear(int proudctionYear) {
        this.proudctionYear = proudctionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", proudctionYear=" + proudctionYear +
                '}';
    }
}
