package practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int now = scanner.nextInt();
        int[] times = {10, 23, 9, 11, 12, 15, 20};

        // 탑승 가능한 놀이기구 개수를 출력하는 코드를 구현합니다.
        TreeSet<Integer> timeSet = new TreeSet<>();
        for (int time : times) {
            timeSet.add(time);
        }
        System.out.println(timeSet.tailSet(now).size());

    }
}
