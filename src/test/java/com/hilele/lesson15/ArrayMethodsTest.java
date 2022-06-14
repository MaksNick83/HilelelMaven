package com.hilele.lesson15;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayMethodsTest extends TestCase {
    ArrayMethods arrayMethods;

    @Before

    public void setUp() throws Exception {
        arrayMethods = new ArrayMethods();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSearchElement() {
        int[] array = {1, 7, 5, 3};
        int actual = arrayMethods.searchElement(array, 3);
        Assert.assertEquals(1, actual);
    }
}