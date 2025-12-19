import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();
    public void addItem(MenuItem item) {
        items.add(item);
    }
    public int getTotalPrice() {
        int total = 0;
        for (MenuItem item : items) {
            total = total + item.getPrice();
        }
        return total;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }
}