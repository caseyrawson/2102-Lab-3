package pizzalab;
public class PepperoniPizza implements Pizza {

    public void makePizza() {
        System.out.println("Making a Pepperoni Pizza");
        prepare();
        bake();
        cut();
        box();
    }
    public void prepare() {
        System.out.println("Preparing Pepperoni...");
    }
    public void bake() {
        System.out.println("Baking Pepperoni...");
    }
    public void cut() {
        System.out.println("Cutting Pepperoni...");
    }
    public void box() {
        System.out.println("Boxing Pepperoni...");
        System.out.println("Ready!\n");
    }
}