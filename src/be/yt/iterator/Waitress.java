package be.yt.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * User: Yves-T
 * Date: 14/11/12
 * Time: 15:13
 */
public class Waitress {

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu>menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "-- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
