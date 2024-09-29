package Lab3.src;
public class PizzaStore {
    public static void main(String[] args) {
    
    PizzaFactory PizzaFactory = new PizzaFactory();
    
    Pizza Pizza = PizzaFactory.createPizza("Cheese");
    Pizza.makePizza();

    Pizza = PizzaFactory.createPizza("Pepperoni");
    Pizza.makePizza();

    Pizza = PizzaFactory.createPizza("Gluten Free");
    Pizza.makePizza();
    
    Pizza = PizzaFactory.createPizza("Greek");
    Pizza.makePizza();
    }
}
    