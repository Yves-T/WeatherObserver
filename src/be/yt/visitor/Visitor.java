package be.yt.visitor;

import oracle.jrockit.jfr.events.DynamicValueDescriptor;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 13:16
 */
public interface Visitor {
    public void visit(Book book);

    public void visit(CD cd);

    public void visit(DVD dvd);
}
