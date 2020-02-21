package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ContactTest {

    @Test
    public void testContactIsNotNull() {
        Contact contact = new Contact();
        assertNotNull(contact);
    }

    @Test
    public void testCanUpdateField() {
        Contact contact = new Contact();
        assertEquals(null, contact.returnLastName());
        String input = "Sir";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        contact.updateLastName(input);
        assertEquals("Sir", contact.returnLastName());
    }
}