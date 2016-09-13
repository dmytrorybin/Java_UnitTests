package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dmytro_Rybin on 9/13/2016.
 */
public class ArithmeticOperationsTest {
    @Test
    public void add() throws Exception {
        ArithmeticOperations ao = new ArithmeticOperations();
        double res = ao.add(5, 7);
        Assert.assertTrue(res == 12);
    }

    @Test
    public void deduct() throws Exception {
        ArithmeticOperations ao = new ArithmeticOperations();
        double res = ao.deduct(7, 5);
        if(res != 2) Assert.fail();
    }

    @Test
    public void mult() throws Exception {
        ArithmeticOperations ao = new ArithmeticOperations();
        double res = ao.mult(5, 3);
        if(res != 15) Assert.fail();
    }

    @Test
    public void dev() throws Exception {
        ArithmeticOperations ao = new ArithmeticOperations();
        double res = ao.dev(14, 7);
        if(res != 2) Assert.fail();
    }

}