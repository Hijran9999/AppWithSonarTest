package com.example;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        App app = new App();
        app.runDivision(10, 2);
        app.runDivision(10, 0);
    }

    public int runDivision(int a, int b) {
        try {
            int result = a / b;
            logger.log(Level.INFO, "Result: {0}", result);
            return result;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Error: Cannot divide by zero", e);
            return -1; // Specific return for error state
        }
    }
}