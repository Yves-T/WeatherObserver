package be.yt.visitor;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:11
 */
public interface Visitable {
    // Elenent interface
    public void accept(Visitor visitor);
}
