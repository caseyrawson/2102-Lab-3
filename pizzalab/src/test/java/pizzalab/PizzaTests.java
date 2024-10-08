package pizzalab;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PizzaTests {
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;
Pizza pizza;
@Before
public void setUp() throws Exception {
pizza = new CheesePizza();
System.setOut(new PrintStream(outContent));
System.setErr(new PrintStream(errContent));
}

@After
public void restoreStreams() {
System.setOut(originalOut);
System.setErr(originalErr);
}

@Test
public void CheesePizzaTest_1() {
pizza.prepare();
String newString = outContent.toString();
assertEquals("Preparing Cheese...\n", newString);
}

@Test
public void CheesePizzaTest_2() {
pizza.bake();
assertNotEquals("Baking a cheeze XYZ\n", outContent.toString());
}

@Test
public void GreekPizzaTest_1() {
pizza = new GreekPizza();
pizza.bake();
assertEquals("Baking Greek...\n", outContent.toString());
}
}