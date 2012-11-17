package be.yt.adapter;

/**
 * User: yves
 * Date: 17/11/12
 * Time: 08:31
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
