package ua.app;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.Time;

import static org.junit.Assert.*;

/**
 * Created by Dmytro_Rybin on 9/13/2016.
 */
public class ArithmeticOperationsTest {
    public static ArithmeticOperations ao;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = Timeout.millis(1000);

    @BeforeClass
    public static void runT() {
        ao = new ArithmeticOperations();
    }

    @Test
    public void testAdd() throws Exception {
        double res = ao.add(5, 7);
        Assert.assertTrue(res == 12);
    }

    @Test
    public void testDeduct() throws Exception {
        double res = ao.deduct(7, 5);
        Assert.assertEquals(res, 2, 0);
    }

    @Test
    public void testMult() throws Exception {
        double res = ao.mult(5, 3);
        if(res != 15) Assert.fail();
    }

    @Test
    public void testDiv() throws Exception {
        double res = ao.div(14, 7);
        if(res != 2) Assert.fail();
    }

    //@Test (expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        ao.div(14.0, 0.0);
    }

   // @Test (timeout = 1000)
    @Test
    public void timeTest() {
        ao.div(14, 7);
    }



}