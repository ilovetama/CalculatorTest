package org.example;

public class Calculator {

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
    double result = 0;
    try {
      result = CalculationUtils.getResult(a / b);
      if (b == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
      }
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.exit(0);
    }
    return result;
  }
}
