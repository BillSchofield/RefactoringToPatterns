package patterns.examples.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeItem implements Item {
    private final List<Item> items;

    public CompositeItem(Item... items) {
        this.items = Arrays.asList(items);
    }

    @Override
    public void print() {
        for (Item item : items) {
            item.print();
        }
    }
}
