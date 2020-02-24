package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class InputTest {

    @Test
    public void testInputClassIsNotNull() {
        Input input = new Input();
        assertNotNull(input);
    }

    @Test
    public void testAcceptsUserInput() {
        Input input = new Input();
        String testInput = "It's a test, yo";
        InputStream in = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(in);
        assertEquals("It's a test, yo", input.getInput("testing"));
    }

    @Test
    public void testValidatesInput() {
        Input input = new Input();
        String testInput = "077075643";
        InputStream in = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(in);
        assertTrue(input.validatePhoneNumber(input.getInput("phone number")));
    }

    @Test
    public void testInvalidInput() {
        Input input = new Input();
        assertFalse(input.validNumber("07d7075643"));
    }

    @Test
    public void testValidInput() {
        Input input = new Input();
        assertTrue(input.validNumber("077075643"));
    }

    @Test
    public void testValidateNumber() {
        Input input = new Input();
        assertTrue(input.validatePhoneNumber("077075643"));
    }


    @Test
    public void testFailValidateNumber() {
        Input input = new Input();
        assertFalse(input.validatePhoneNumber("077D75643"));
    }

    @Test
    public void testValidateDOB() {
        Input input = new Input();
        assertTrue(input.validDOB("10/02/99"));
    }

    @Test
    public void testFailValidateDOB() {
        Input input = new Input();
        assertFalse(input.validDOB("l10/02/99"));
    }
}