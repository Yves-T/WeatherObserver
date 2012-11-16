package be.yt.template;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 10:42
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the lemmon");
    }
}
