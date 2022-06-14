package com.hilele.lesson15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    Calc calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calc();
    }

    @Test
    public void testCalculate() {
        double actual = calc.calculate(1.1, "+", 2.2);
        Assert.assertEquals(3.3, actual);

    }
    /*
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int actual = calc.add(2, 2);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void testAddWhenMembersNegative() {
        Calc calc = new Calc();
        int actual = calc.add(-2, -2);
        Assert.assertEquals(-4, actual);
    }

    @Test
    public void testAddWhenOneMembersNegative() {
        Calc calc = new Calc();
        int actual = calc.add(-2, 0);
        Assert.assertEquals(-2, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testAddWhenOneMembersNull() {
        Calc calc = new Calc();
        int actual = calc.add(-2, null);
        Assert.assertEquals(-2, actual);
    }
    */

}
