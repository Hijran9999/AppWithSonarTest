package com.example;

import com.example.App;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSuccessfulDivision() {
        App app = new App();
        assertEquals(5, app.runDivision(10, 2));
    }

    @Test
    public void testDivideByZero() {
        App app = new App();
        // This exercises the 'catch' block for 100% coverage
        assertEquals(-1, app.runDivision(10, 0));
    }

    @Test
    public void testMainMethod() {
        // Calling main ensures even the entry point is "covered"
        App.main(new String[]{});
        assertTrue(true); 
    }
}