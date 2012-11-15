package be.yt.iterator;

import java.util.Iterator;
/**
 * User: Yves-T
 * Date: 14/11/12
 * Time: 15:03
 */
public class DinerMenuIterator<MenuItem> implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return  menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            System.arraycopy(items, position, items, position - 1, items.length - 1 - (position - 1));
            items[items.length - 1] = null;
        }
    }
}
