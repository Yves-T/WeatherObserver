package be.yt.visitor;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:28
 */
public class TestTheVisitor {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Book book = new Book(5, 5);
        // this book gets free postage (price < 10)
        Book freeBook = new Book(15, 5);

        CD cd = new CD(2, 5);
        // free postage for a cd over 5
        CD freeCD = new CD(30, 5);

        DVD dvd = new DVD(2, 5);
        // free postage for a dvd over 30
        DVD freeDVD = new DVD(35, 5);


        shoppingCart.addItem(book);
        shoppingCart.addItem(freeBook);
        shoppingCart.addItem(cd);
        shoppingCart.addItem(freeCD);
        shoppingCart.addItem(dvd);
        shoppingCart.addItem(freeDVD);

        // book 5 * 2 = 10
        // cd   5 * 2 = 10
        // dvd  5 * 2 = 10
        // total should be 30.0
        assert shoppingCart.calculatePostage() == 30;
        System.out.println("postage = " + shoppingCart.calculatePostage());
    }
}
