package java_tutorials.java8.lambdas;

import java8.lambdas.FunctionalInterface2;
import java8.lambdas.FunctionalInterface3;
import java8.lambdas.MyFuncInterface;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by joyghosh on 29/05/18.
 */
public class LambdaTest{

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void setUpStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /**
     * Test Lambda feature test.
     */
    @Test
    public void test_lambdaFeature(){
        MyFuncInterface mfi;
        mfi = () -> 123454.889;
        Assert.assertEquals(123454.889, mfi.getValue(), 0.001);
    }

    @Test
    public void test_functionalInterfaceWithDefaultAndStatic(){
        FunctionalInterface2 f = (s) -> System.out.println("Hello! "+s);

        f.printValue("Thomas Watson");
        Assert.assertEquals("Hello! Thomas Watson\n", outContent.toString());

        outContent.reset();

        f.printDefault("Watson says Hi!");
        Assert.assertEquals("[FI2]: default Watson says Hi!\n",
                outContent.toString());

        outContent.reset();

        FunctionalInterface2.printStatic("Tom Cruise says Hello!");
        Assert.assertEquals("[FI2]: static Tom Cruise says Hello!\n",
                outContent.toString());
    }

    @Test
    public void test_extendsFunctionalInterface(){

        FunctionalInterface3 f = (s) -> System.out.println("Hello! "+s);
        outContent.reset();

        f.printValue("Gill");
        Assert.assertEquals("Hello! Gill\n", outContent.toString());

        outContent.reset();

        f.printDefault("Gill says Hello!");
        Assert.assertEquals("[FI3] default: Gill says Hello!\n",
                outContent.toString());

        outContent.reset();
        FunctionalInterface3.printStatic("Gill says Hi!");
        Assert.assertEquals("[FI3] static: Gill says Hi!\n",
                outContent.toString());
    }

    @AfterClass
    public static void resetStreams(){
        System.setOut(System.out);
        System.setErr(System.err);
    }
}
