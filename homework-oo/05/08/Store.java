import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    List<SellableItem> s;

    public Store(String name) {
        setName(name);
        this.s = new ArrayList<SellableItem>();
    }

    public void addSellableItem(SellableItem si) {
        s.add(si);
    }

    public void removeSellableItem(SellableItem si) {
        s.remove(si);
    }

    public SellableItem getSellableItem(int i) {
        if(s.isEmpty()) {
            System.out.println("no items in store");
            return null;
        }
        return s.get(i);
    }

    public void sellAllItems() {
        s.clear();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}