package be.yt.visitor;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:17
 */
public class PostageVisitor implements Visitor {
    private double totalPostageForcart;

    // collect data about the book
    @Override
    public void visit(Book book) {
        // assume we have a calculation here related to weight and price
        // free postage for a book over 10
        if (book.getPrice() < 10.0) {
            totalPostageForcart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        // free postage for a cd over 5
        if (cd.getPrice() < 5.0) {
            totalPostageForcart += cd.getWeight() * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        //To change body of implemented methods use File | Settings | File Templates.
        // free postage for a dvd over 30
        if (dvd.getPrice() < 30.0) {
            totalPostageForcart += dvd.getWeight() * 2;
        }
    }

    // add other visitors here

    // return the internal state
    public double getTotalPostage() {
        return totalPostageForcart;
    }
}
