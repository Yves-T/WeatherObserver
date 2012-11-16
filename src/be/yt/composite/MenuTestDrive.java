package be.yt.composite;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * User: Yves-T
 * Date: 15/11/12
 * Time: 14:29
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancakeHouseMenu", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);


        // add menu items here
        cafeMenu.add(new MenuItem("veggie burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce,tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "(fakin') Bacon with lettuce & tomato on whole wheat",
                true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake breakfast",
                "Pancake with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "With your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust, topped with vanilla ice cream",
                true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        System.out.println("\nOnly the vegetarian menu");
        waitress.printVegetarianMenu();
    }


}
