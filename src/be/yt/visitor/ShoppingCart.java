package be.yt.visitor;

import java.util.ArrayList;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:22
 */
public class ShoppingCart {
    // normal shopping cart stuff
    private ArrayList<Visitable> items;

    public ShoppingCart() {
        this.items = new ArrayList<Visitable>();
    }

    public double calculatePostage() {
        // create visitor
        PostageVisitor postageVisitor = new PostageVisitor();
        // iterate trough all items
        for (Visitable item : items) {
            item.accept(postageVisitor);
        }
        return postageVisitor.getTotalPostage();
    }

    public void addItem(Visitable visitableItem) {
        items.add(visitableItem);
    }
}
