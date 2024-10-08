package pizzalab;
public class GlutenFreePizza implements Pizza {

    public void makePizza() {
        System.out.println("Making a Gluten-Free Pizza");
        prepare();
        bake();
        cut();
        box();
    }
    public void prepare() {
        System.out.println("Preparing Gluten-Free...");
    }
    public void bake() {
        System.out.println("Baking Gluten-Free...");
    }
    public void cut() {
        System.out.println("Cutting Gluten-Free...");
    }
    public void box() {
        System.out.println("Boxing Gluten-Free...");
        System.out.println("Ready!\n");
    }
}