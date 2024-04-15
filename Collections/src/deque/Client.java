package deque;

public class Client implements Comparable<Client>{
    private String name;
    private int loyalty;


    public Client(String name, int loyalty) {
        this.name = name;
        this.loyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", loyalty=" + loyalty +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.getLoyalty(), o.getLoyalty());
    }
}
