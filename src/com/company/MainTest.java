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
}