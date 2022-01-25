package org.example;

public class Calculator {

  private static final String ERROR_MESSAGE = "Division by zero is not allowed";

  public double add(double a, double b) {
    return CalculationUtils.getResult(a + b);
  }

  public double subtract(double a, double b) {
    return CalculationUtils.getResult(a - b);
  }

  public double multiply(double a, double b) {
    return CalculationUtils.getResult(a * b);
  }

  public double divide(double a, double b) {
    if (a > 0 && b == 0.0) {
      System.out.println(ERROR_MESSAGE);
      return Double.POSITIVE_INFINITY;
    } else if (a < 0 && b == 0.0) {
      System.out.println(ERROR_MESSAGE);
      return Double.NEGATIVE_INFINITY;
    } else if (a == 0 && b == 0) {
      System.out.println(ERROR_MESSAGE);
      return Double.NaN;
    } else {
      return CalculationUtils.getResult(a / b);
    }
  }
}

