package pizzalab;
public class GreekPizza implements Pizza {

    public void makePizza() {
        System.out.println("Making a Greek Pizza");
        prepare();
        bake();
        cut();
        box();
    }
    public void prepare() {
        System.out.println("Preparing Greek...");
    }
    public void bake() {
        System.out.println("Baking Greek...");
    }
    public void cut() {
        System.out.println("Cutting Greek...");
    }
    public void box() {
        System.out.println("Boxing Greek...");
        System.out.println("Ready!\n");
    }
}