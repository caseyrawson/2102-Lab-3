package pizzalab;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PizzaFactoryTests {
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;
Pizza pizza;

@Before
public void setUp() throws Exception {
System.setOut(new PrintStream(outContent));
System.setErr(new PrintStream(errContent));
}

@After
public void restoreStreams() {
System.setOut(originalOut);
System.setErr(originalErr);
}

@Test
public void PizzaFactoryTest_1() {
PizzaFactory pizzaFactory = new PizzaFactory();
Pizza myTextPizzaType = pizzaFactory.createPizza("Greek");
assertTrue( myTextPizzaType instanceof GreekPizza );
assertTrue( myTextPizzaType instanceof Pizza );
}

@Test
public void PizzaFactoryTest_2() {
PizzaFactory pizzaFactory = new PizzaFactory();
Pizza myTextPizzaType = pizzaFactory.createPizza("Cheese");
assertTrue( myTextPizzaType instanceof CheesePizza );
assertTrue( myTextPizzaType instanceof Pizza );
}

@Test
public void PizzaFactoryTest_3() {
PizzaFactory pizzaFactory = new PizzaFactory();
Pizza myTextPizzaType = pizzaFactory.createPizza("Gluten Free");
assertTrue( myTextPizzaType instanceof GlutenFreePizza );
assertTrue( myTextPizzaType instanceof Pizza );
}
}