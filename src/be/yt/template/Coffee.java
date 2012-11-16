package be.yt.template;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 10:31
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee trough filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
