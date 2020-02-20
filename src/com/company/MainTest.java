package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testClassIsNotNull() {
        Main main = new Main();
        assertNotNull(main);
    }

    @Test
    public void testFirstNameIsAString() {
        Main main = new Main();
        assertEquals(main.FirstName instanceof String, true);
    }
}