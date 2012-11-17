package be.yt.adapter;

/**
 * User: Yves-T
 * Date: 17/11/12
 * Time: 08:27
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
