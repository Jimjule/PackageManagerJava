package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMainClassIsNotNull() {
        Main main = new Main();
        assertNotNull(main);
    }

    @Test
    public void testInstantiatesOtherClasses() {
        Main main = new Main();
        assertEquals(true, main.input instanceof Input);
        assertEquals(true, main.contact instanceof Contact);
    }
}