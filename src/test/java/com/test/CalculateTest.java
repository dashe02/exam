package com.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 下午9:15
 * To change this template use File | Settings | File Templates.
 */
public class CalculateTest {
    private static Calculate calculate=new Calculate();
    @Before
    public void setUp() throws Exception {
        calculate.clear();
    }

    @Test
    public void testAdd() throws Exception {
         calculate.add(2);
         calculate.add(3);
         assertEquals(5,calculate.getResult());
    }

    @Test
    public void testSubstract() throws Exception {
            calculate.add(10);
            calculate.substract(2);
            assertEquals(8,calculate.getResult());
    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {
           calculate.add(8);
           calculate.divide(2);
           assertEquals(4,calculate.getResult());
    }

    @Test
    public void testSquare() throws Exception {

    }

    @Test
    public void testSquareRoot() throws Exception {

    }

    @Test
    public void testClear() throws Exception {

    }

    @Test
    public void testGetResult() throws Exception {

    }
}
