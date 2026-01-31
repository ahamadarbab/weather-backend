package com.example.weather_backend;

import com.example.weather_backend.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumber() {
        // AAA --> ARRANGE, ACT, ASSERT
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResp = calculator.add(4, 5);
        int expectedResp = 9;
        // Assert -> will do the verification that actual response is equals to the expected response or not.
        assertEquals(expectedResp, actualResp);
    }

    @Test
    public void shouldDivideTwoNumber() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResp = calculator.divide(10, 5);
        int expectedResp = 2;
        // Assert
        assertEquals(expectedResp, actualResp);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        Calculator calculator = new Calculator();
        Exception actualException = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by 0", actualException.getMessage());
    }
}
