package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

  public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
      calculator = new Calculator();
    }

    @Test
    void addTwoPositiveNumbers() {
      double a = 10.137;
      double b = 6.314;
      double actualResult = calculator.add(a, b);
      double expectedResult = 16.45;
      Assertions.assertEquals(expectedResult, actualResult, "Wrong result of method 'add'");
    }

    @Test
    void divideTwoPositiveNumbers() {
      double a = 10.1;
      double b = 0;
      double actualResult = calculator.divide(a, b);
      double expectedResult = 1.6;
      Assertions.assertEquals(expectedResult, actualResult, "Wrong result of method 'divide'");
    }

    @Test
    void multiplyTwoPositiveNumbers() {
      double a = 10.1;
      double b = 6.3;
      double actualResult = calculator.multiply(a, b);
      double expectedResult = 63.63;
      Assertions.assertEquals(expectedResult, actualResult, "Wrong result of method 'multiply'");
    }

    @Test
    void subtractTwoPositiveNumbers() {
      double a = 10.1;
      double b = 6.3;
      double actualResult = calculator.subtract(a, b);
      double expectedResult = 3.8;
      Assertions.assertEquals(expectedResult, actualResult, "Wrong result of method 'subtract'");
    }

    @Test
    void addTwoPositiveNumbersWithTwoSymbolsPrecision() {
      double a = 10.1;
      double b = 6.354;
      double actualResult = calculator.add(a, b);
      double expectedResult = 16.45;
      Assertions.assertEquals(expectedResult, actualResult, "Wrong result of method 'add'");
    }
  }