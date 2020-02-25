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
    public void testInvalidMenuChoice() {
        Input input = new Input();
        String testInput = "text";
        InputStream in = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(in);
        assertNotNull(input.menuChoice());
    }
}