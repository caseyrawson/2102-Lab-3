public class GlutenFreePizza implements Pizza {

    public void makePizza() {
        System.out.println("Making a Gluten-Free Pizza");
        prepare();
        bake();
        cut();
        box();
    }
    public void prepare() {
        System.out.println("Preparing...");
    }
    public void bake() {
        System.out.println("Baking...");
    }
    public void cut() {
        System.out.println("Cutting...");
    }
    public void box() {
        System.out.println("Boxing...");
        System.out.println("Ready!\n");
    }
}