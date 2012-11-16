package be.yt.template;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 11:10
 */
public class TestTemplatePattern {
    public static void main(String[] args) {
        Tea myTea = new Tea();

        System.out.println("Making tea...");
        myTea.prepareRecipe();

        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Making coffee...");
        coffeeHook.prepareRecipe();
    }
}
