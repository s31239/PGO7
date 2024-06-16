import java.util.*;

public class main2 {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            itemList.add(new Item(i, "Przedmiot" + i));
        }
        List<Item> firstFiveItems = itemList.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}