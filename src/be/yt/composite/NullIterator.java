package be.yt.composite;

import java.util.Iterator;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 8:50
 */
public class NullIterator implements Iterator<MenuComponent> {
    // a leaf has nothing to iterate over
    // this iterator always return false with hasNext so that
    // the client never has to worry about whether or not
    // null has returned
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
