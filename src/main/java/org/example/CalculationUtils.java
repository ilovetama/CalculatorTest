package org.example;

import java.util.Scanner;

public class CalculationUtils {

  private static final String ARITHMETIC_SINGS = "[-+*/]";

  public static double getNumber() {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");
    System.out.println("Enter the number:");
    if (scanner.hasNextDouble()) {
      return scanner.nextDouble();
    } else {
      System.out.println("Number is incorrect. Try again");
      return getNumber();
    }
  }

  public static char getOperation() {
    System.out.println("Enter the operation (+, -, *, /):");
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");
    char operation;
    if (scanner.hasNext(ARITHMETIC_SINGS)) {
      operation = scanner.next().charAt(0);
    } else {
      System.out.println("Operation is incorrect. Try again");
      operation = getOperation();
    }
    return operation;
  }

  public static double calculation(char operation, double firstNumber, double secondNumber) {
    Calculator calculate = new Calculator();
    return switch (operation) {
      case '+' -> calculate.add(firstNumber, secondNumber);
      case '-' -> calculate.subtract(firstNumber, secondNumber);
      case '*' -> calculate.multiply(firstNumber, secondNumber);
      case '/' -> calculate.divide(firstNumber, secondNumber);
      default -> 0;
    };
  }

  public static double getResult(double result) {
    final int CALCULATION_ACCURACY = 2; //A quantity of digits after comma
    return Math.round((result) * (int) Math.pow(10.0, CALCULATION_ACCURACY)) / Math.pow(10.0,
        CALCULATION_ACCURACY);
  }
}
