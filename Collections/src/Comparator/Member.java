package Comparator;

public class Member {

    private final int age;
    private final int id;

    public Member(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MEMBER[id: " + id + ", age: " + age + "]";
    }
}

