package be.yt.template;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 10:52
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // this is a hook because  the subclass can override this
    // method but doesn't have to
    boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
