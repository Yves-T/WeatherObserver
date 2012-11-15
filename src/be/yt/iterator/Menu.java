package be.yt.iterator;

import java.util.Iterator;
/**
 * User: Yves-T
 * Date: 15/11/12
 * Time: 8:53
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
