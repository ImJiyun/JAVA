package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example7 {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String nickname = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            nameSet.add(scanner.nextLine());
        }
        if (nameSet.contains(nickname)) {
            System.out.println("이미 사용 중인 닉네임입니다.");
        }  else {
            System.out.println("사용 가능한 닉네임입니다");
        }
    }
}
