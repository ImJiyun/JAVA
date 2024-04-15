package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        List<Integer> heightList = new ArrayList<>();

        for (int i = 0; i < totalNumber; i++) {
            heightList.add(sc.nextInt());
        }

        Solution.solution(heightList.listIterator());
    }
}

class Solution {

    public static void solution(ListIterator<Integer> iterator) {
        int maxNum = 0;
        int count = 0;
        while (iterator.hasNext()) {
            int nextNum = iterator.next();
            if (nextNum > maxNum) {
                count++;
            }
            maxNum = nextNum;
        }
        System.out.println(count);
    }

    private Solution() {}
}
