package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dmytro_Rybin on 9/13/2016.
 */
public class ArithmeticOperationsTest {
    public static ArithmeticOperations ao;

    @BeforeClass
    public static void runT() {
        ao = new ArithmeticOperations();
    }

    @Test
    public void add() throws Exception {
        double res = ao.add(5, 7);
        Assert.assertTrue(res == 12);
    }

    @Test
    public void deduct() throws Exception {
        double res = ao.deduct(7, 5);
        Assert.assertEquals(res, 2, 0);
    }

    @Test
    public void mult() throws Exception {
        double res = ao.mult(5, 3);
        if(res != 15) Assert.fail();
    }

    @Test
    public void dev() throws Exception {
        double res = ao.dev(14, 7);
        if(res != 2) Assert.fail();
    }

}