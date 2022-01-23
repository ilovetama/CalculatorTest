package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @ParameterizedTest
  @MethodSource("addData")
  void addNumbers(double a, double b, double result) {
    double actualResult = calculator.add(a, b);
    assertEquals(result, actualResult, 0.01);
  }

  @ParameterizedTest
  @MethodSource("subtractData")
  void subtractNumbers(double a, double b, double result) {
    double actualResult = calculator.subtract(a, b);
    assertEquals(result, actualResult, 0.01);
  }

  @ParameterizedTest
  @MethodSource("multiplyData")
  void multiplyNumbers(double a, double b, double result) {
    double actualResult = calculator.multiply(a, b);
    assertEquals(result, actualResult, 0.01);
  }

  @ParameterizedTest
  @MethodSource("divideData")
  void divideNumbers(double a, double b, double result) {
    double actualResult = calculator.divide(a, b);
    assertEquals(result, actualResult, 0.01);
  }

//  @Test
//  void divideByZero() {
//    Exception exception = assertThrows(ArithmeticException.class, () ->
//        calculator.divide(1, 0));
//    assertEquals("Division by zero is not allowed", exception.getMessage());
//  }

//  @Test
//  @DisplayName("Division by zero test")
//  void divideByZero() {
//    Exception exception = assertThrows( ArithmeticException.class, () ->
//          calculator.divide(1.0, 0.0));
//    assertEquals("Division by zero is not allowed", exception.getMessage());
//    assertTrue(exception.getMessage().contains("Division by zero is not allowed"));
//  }

  private static Stream<Arguments> addData() {
    return Stream.of(
        Arguments.of(2.82, 3.93, 6.75),
        Arguments.of(-3.12, 2.06, -1.06),
        Arguments.of(0.01, 0.09, 0.1)
    );
  }

  private static Stream<Arguments> subtractData() {
    return Stream.of(
        Arguments.of(2.82, 3.93, -1.11),
        Arguments.of(3.12, 2.06, 1.06),
        Arguments.of(-3.12, 2.06, -5.18),
        Arguments.of(0.01, 0.09, -0.08)
    );
  }

  private static Stream<Arguments> multiplyData() {
    return Stream.of(
        Arguments.of(2.82, 3.93, 11.08),
        Arguments.of(-3.12, 2.06, -6.43),
        Arguments.of(-3.12, -2.06, 6.43),
        Arguments.of(0, 0.09, 0)
    );
  }

  private static Stream<Arguments> divideData() {
    return Stream.of(
        Arguments.of(2.82, 3.93, 0.72),
        Arguments.of(-3.12, 2.06, -1.51),
        Arguments.of(-3.12, -2.06, 1.51)
    );
  }

}
