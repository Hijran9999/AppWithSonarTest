//
//public class App {
//    public static void main(String[] args) {
//        System.out.println("Hello SonarQube Demo!");
//
//        // Intentional issue: unused variable
//        int unusedVariable = 42;
//
//        // Intentional bug: empty catch block
//        try {
//            int result = 10 / 0;
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//    }
//}
package com.example; // Best practice: always use a package

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    // SonarQube prefers Loggers over System.out.println
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Hello SonarQube Demo!");

        // FIX 1: Removed 'unusedVariable' to eliminate the "Unused Local Variable" smell.

        // FIX 2: Added proper logic and logging to the catch block.
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor;
            logger.log(Level.INFO, "Result: {0}", result);
        } catch (ArithmeticException e) { 
            // SonarQube Fix: Catch specific exceptions and log them or take action.
            logger.log(Level.SEVERE, "Cannot divide by zero.", e);
        }
    }
}