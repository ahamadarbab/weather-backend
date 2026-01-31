package com.example.weather_backend;

import com.example.weather_backend.service.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    // Junit
    // Before All -> runs before running all the test cases.
    // And to run a testcase we should have object created.
    // Before All will run before the object creation of the test class
    // Before All -> gets executed before the object creation of calculator class
    // To run every testcase internally junit is creating new object of test class

    Calculator calculator;

    @BeforeAll
    public static void sayHello() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void sayBye() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before executing a test it will run for every testcase");
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After executing a test it will run for every testcase");
        calculator = null;
    }

    @Test
    public void shouldAddTwoNumber() {
        // AAA --> ARRANGE, ACT, ASSERT
        // Arrange
        // Calculator calculator = new Calculator();
        // Act
        System.out.println("Inside Test 1");
        int actualResp = calculator.add(4, 5);
        int expectedResp = 9;
        // Assert -> will do the verification that actual response is equals to the expected response or not.
        assertEquals(expectedResp, actualResp);
    }

    @Test
    public void shouldDivideTwoNumber() {
        // Arrange
        // Calculator calculator = new Calculator();
        // Act
        System.out.println("Inside Test 2");
        int actualResp = calculator.divide(10, 5);
        int expectedResp = 2;
        // Assert
        assertEquals(expectedResp, actualResp);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        // Calculator calculator = new Calculator();
        System.out.println("Inside Test 3");
        Exception actualException = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by 0", actualException.getMessage());
    }
}
