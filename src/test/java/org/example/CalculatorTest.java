package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
  @DisplayName("Addition test")
  void addNumbers(double a, double b, double result) {
    double actualResult = calculator.add(a, b);
    assertEquals(result, actualResult, 0.01, "Add method is not correct. Expected"
        + " " + result + " but found " + actualResult);
  }

  @ParameterizedTest
  @MethodSource("subtractData")
  @DisplayName("Subtraction test")
  void subtractNumbers(double a, double b, double result) {
    double actualResult = calculator.subtract(a, b);
    assertEquals(result, actualResult, 0.01, "Subtract method is not correct. Expected"
        + " " + result + " but found " + actualResult);
  }

  @ParameterizedTest
  @MethodSource("multiplyData")
  @DisplayName("Multiplication test")
  void multiplyNumbers(double a, double b, double result) {
    double actualResult = calculator.multiply(a, b);
    assertEquals(result, actualResult, 0.01, "Multiply method is not correct. Expected"
        + " " + result + " but found " + actualResult);
  }

  @ParameterizedTest
  @DisplayName("Division test")
  @MethodSource("divideData")
  void divideNumbers(double a, double b, double result) {
    double actualResult = calculator.divide(a, b);
    assertEquals(result, actualResult, 0.01, "Divide method is not correct. Expected"
        + " " + result + " but found " + actualResult);
  }

  private static Stream<Arguments> addData() {
    return Stream.of(
        Arguments.of(2.82, 3.93, 6.75),
        Arguments.of(-3.12, 2.06, -1.06),
        Arguments.of(0.01, 0.09, 0.1),
        Arguments.of(123, 159, 282)

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
        Arguments.of(-3.12, -2.06, 1.51),
        Arguments.of(320, 18, 17.78)
    );
  }

}
