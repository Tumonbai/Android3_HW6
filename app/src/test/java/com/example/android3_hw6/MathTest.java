package com.example.android3_hw6;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

public class MathTest extends TestCase {

    Math math;

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    public void testAdd() {
        assertEquals(6, 2, 4);
        assertEquals(20, 10, 10);
    }

    public void testSub() {
        assertEquals(6, 10, 4);
        assertEquals(45, 65, 20);
    }

    public void testDiv() {
        assertEquals(4, math.div(24, 6));
    }

    public void testMultiply() {
        assertEquals(32, math.multiply(4, 8));
        assertEquals(30, math.multiply(5, 6));
    }


}
