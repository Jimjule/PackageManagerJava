package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testClassIsNotNull() {
        Main main = new Main();
        assertNotNull(main);
    }

    @Test
    public void testAcceptsUserInput() {
        Main main = new Main();
        String input = "It's a test, yo";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("It's a test, yo", main.getInput());
    }
}