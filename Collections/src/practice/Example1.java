package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            nums.add(i);
        }

        while (num != -1) {

            Integer card = nums.remove(num - 1);
            nums.add(card);
            num = scanner.nextInt();
        }

        System.out.println(nums);

    }
}
