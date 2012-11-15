package be.yt.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * User: Yves-T
 * Date: 14/11/12
 * Time: 15:18
 */
public class PancakeMenuIterator<MenuItem> implements Iterator<MenuItem> {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.size() || menuItems.get(position) == null);
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
        menuItems.remove(position);
    }
}
