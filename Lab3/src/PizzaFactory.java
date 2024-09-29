package Lab3.src;
public class PizzaFactory {

    public Pizza createPizza(String type) {
    if (type == null || type.isEmpty())
     return null;
    switch (type) {
        case "Cheese":
            return new CheesePizza();
        case "Greek":
            return new GreekPizza();
        case "Pepperoni":
            return new PepperoniPizza();
        case "Gluten Free":
            return new GlutenFreePizza();        
        default:
            throw new IllegalArgumentException("Unknown type "+type);
    }
   }
}