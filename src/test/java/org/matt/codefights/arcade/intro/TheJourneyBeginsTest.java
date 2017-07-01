package org.matt.codefights.arcade.intro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheJourneyBeginsTest {

    TheJourneyBegins theJourneyBegins;

    @Before
    public void setUp() {
        theJourneyBegins = new TheJourneyBegins();
    }
    @Test
    public void addTest1() {
        assertEquals(3, theJourneyBegins.add(1, 2));
    }

    @Test
    public void addTest2() {
        assertEquals(1000, theJourneyBegins.add(0, 1000));
    }

}
