package be.yt.visitor;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:54
 */
public class DVD implements Visitable {
    private double price;
    private double weight;

    public DVD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    // accept the visitor
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
