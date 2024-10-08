package pizzalab;
public class CheesePizza implements Pizza {

    public void makePizza() {
        System.out.println("Making a Cheese Pizza");
        prepare();
        bake();
        cut();
        box();
    }
    public void prepare() {
        System.out.println("Preparing Cheese...");
    }
    public void bake() {
        System.out.println("Baking Cheese...");
    }
    public void cut() {
        System.out.println("Cutting Cheese...");
    }
    public void box() {
        System.out.println("Boxing Cheese...");
        System.out.println("Ready!\n");
    }
    
}