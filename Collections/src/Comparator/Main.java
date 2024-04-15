package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < totalNumber; i++) {
            int id = sc.nextInt();
            int age = sc.nextInt();
            memberList.add(new Member(id, age));
        }

        memberList.sort(new MyComparator());

        System.out.println(memberList);
    }
}

