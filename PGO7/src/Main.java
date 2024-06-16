import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Przedmiot1"));
        itemList.add(new Item(2, "Przedmiot2"));
        itemList.add(new Item(3, "Przedmiot3"));
        itemList.add(new Item(4, "Przedmiot4"));
        itemList.add(new Item(5, "Przedmiot5"));
        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }
        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Identyfikator: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }
    }
}