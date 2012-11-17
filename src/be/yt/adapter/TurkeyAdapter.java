package be.yt.adapter;

/**
 * User: Yves-T
 * Date: 17/11/12
 * Time: 08:33
 */

// first implement the interface of the type you are adapting to
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // receive object that we're adapting
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // translate all interface methods

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
