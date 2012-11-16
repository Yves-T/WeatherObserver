package be.yt.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * User: Yves-T
 * Date: 15/11/12
 * Time: 14:11
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menucomponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menucomponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menucomponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menucomponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menucomponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
       return new CompositeIterator(menucomponents.iterator());
    }
}
