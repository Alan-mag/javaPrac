// This program prompts for and evaluates a prefix expression.

import java.util.*;

public class PrefixEvaluator {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("This program evaluates prefix");
    System.out.println("expressions that include the");
    System.out.println("operators +, -, / and %");
    System.out.print("Expression? ");
    double value = evaluate(console);
    System.out.printf("value = " + value);
    System.out.println();
  }

  // pre: input contains a legal prefix expression
  // post: expression is consumed and the result is returned
  public static double evaluate(Scanner input) {
    if (input.hasNextDouble()) {
      return input.nextDouble();
    } else {
      String operator = input.next();
      double operand1 = evaluate(input);
      double operand2 = evaluate(input);
      return apply(operator, operand1, operand2);
    }
  }

  // pre: operator is one of +, -, *, / or %
  // post: returns the result of applying the given operator
  // to the given operands
  public static double apply(String operator, double operand1, double operand2) {
    if (operator.equals("+")) {
      return operand1 + operand2;
    } else if (operator.equals("-")) {
      return operand1 - operand2;
    } else if (operator.equals("*")) {
      return operand1 * operand2;
    } else if (operator.equals("/")) {
      return operand1 / operand2;
    } else if (operator.equals("%")) {
      return operand1 % operand2;
    } else {
      throw new IllegalArgumentException("bad operator: " + operator);
    }
  }
}