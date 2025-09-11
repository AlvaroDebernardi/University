import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import duck.*;
import flySystem.*;
import quackSystem.*;

public class TestDuck {

    @Test
    public void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
    }

    @Test
    public void testModelDuckChangeFlyBehavior() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    @Test
    void humandDuckTest() {
        PrintStream oldOutput = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(256);
        PrintStream newOutput = new PrintStream(buffer);

        System.setOut(newOutput);

        Duck humanDuck = new HumanDuck();
        humanDuck.performQuack();
        assertEquals("I'm pretending to be a duck.\n", buffer.toString());

        System.setOut(oldOutput);
    }

    @Test
    void humandDuckChangeQuackTest() {
        PrintStream oldOutput = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(256);
        PrintStream newOutput = new PrintStream(buffer);

        System.setOut(newOutput);

        Duck humanDuck = new HumanDuck();
        humanDuck.setQuackBehavior(new Quack());
        humanDuck.performQuack();

        assertEquals("Quack\n", buffer.toString());

        System.setOut(oldOutput);
    }

}
