package be.yt.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * User: Yves-T
 * Date: 15/11/12
 * Time: 15:23
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        // if client wants next element check if there is one
        if (hasNext()) {
            // if there is a next item fetch it's iterator from the stack
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            // if iterator is a menu, we have another composition that needs
            // to be included in the iteration, so throw it on the stack
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        // if the stack is empty, there is no next element
        if (stack.empty()) {
            return false;
        } else {
            // fetch iterator
            Iterator<MenuComponent> iterator = stack.peek();
            // if this iterator has no next element
            if (!iterator.hasNext()) {
                // throw it off the stack and call hasNext() recursively
                stack.pop();
                return hasNext();
            } else {
                // otherwise there is a next element, so return true
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
