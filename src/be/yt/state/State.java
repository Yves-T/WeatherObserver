package be.yt.state;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 10:56
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
