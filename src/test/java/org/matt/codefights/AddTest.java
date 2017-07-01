package org.matt.codefights;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {

    @Test
    public void test1() {
        assertEquals(3, Add.add(1, 2));
    }

    @Test
    public void test2() {
        assertEquals(1000, Add.add(0, 1000));
    }

}
