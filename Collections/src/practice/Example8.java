package practice;

import java.util.HashSet;
import java.util.Set;

class ItemManager {
    private Set<String> itemIds = new HashSet<>();

    public void addItem(String itemId) {
        itemIds.add(itemId);
    }

    public boolean removeItem(String itemId) {
        return itemIds.remove(itemId);
    }

    public void showItems() {
        System.out.println(itemIds);
    }
}

public class Example8 {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();

        // 아이템 ID 추가
        manager.addItem("sword1001");
        manager.addItem("shield2001");
        manager.addItem("potion3001");
        // 동일한 ID를 가진 아이템 추가
        manager.addItem("potion3001");

        // 전체 아이템 ID 조회
        manager.showItems();

        // 아이템 ID 제거
        manager.removeItem("potion3001");
        manager.showItems();
    }
}
