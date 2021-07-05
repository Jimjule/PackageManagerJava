package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void testMainClassIsNotNull() {
        Menu menu = new Menu();
        assertNotNull(menu);
    }

    @Test
    public void testInstantiatesOtherClasses() {
        Menu menu = new Menu();
        assertEquals(true, menu.input instanceof Input);
        assertEquals(true, menu.contact instanceof Contact);
    }
}