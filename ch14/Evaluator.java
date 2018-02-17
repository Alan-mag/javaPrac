import java.util.*;

public class Evaluator {
  public static void main(String args[]) {
    System.out.println("This program evaluates fully");
    System.out.println("parenthesized expressions with the");
    System.out.println("operators +, -, *, / and ^");
    System.out.println();
    Scanner console = new Scanner(System.in);
    System.out.print("expression (return to quit)? ");
    String line = console.nextLine().trim();
    while (line.length() > 0) {
      evaluate(line);
      System.out.print("expression (return to quit)? ");
      line = console.nextLine().trim();
    }
  }

  public static void evaluate(String line) {
    StringSplitter data = new StringSplitter(line);
    Stack<String> symbols = new Stack<String>();
    Stack<Double> values = new Stack<Double>();
    boolean error = false;
    while (!error && data.hasNext()) {
      String next = data.next();
      if (next.equals(")")) {
        if (symbols.size() < 2 ||
            symbols.peek().equals("(")) {
              error = true;
            } else {
              String operator = symbols.pop();
              if (!symbols.peek().equals("(")) {
                error = true;
              } else {
                symbols.pop();
                double op2 = values.pop();
                double op1 = values.pop();
                double value = evaluate(operator, op1, op2);
                values.push(value);
              }
            }
      } else if ("(+-*/^".contains(next)) {
        symbols.push(next);
      } else {
        values.push(Double.parseDouble(next));
      }
    }
    if (error || values.size() != 1 || !symbols.isEmpty()) {
      System.out.println("Illegal Expression");
    } else {
      System.out.println(values.pop());
    }
  }

  public static double evaluate(String operator, double operand1, double operand2) {
    if (operator.equals("+")) {
      return operand1 + operand2;
    } else if (operator.equals("-")) {
      return operand1 - operand2;
    } else if (operator.equals("*")) {
      return operand1 * operand2;
    } else if (operator.equals("/")) {
      return operand1 / operand2;
    } else if (operator.equals("^")) {
      return Math.pow(operand1, operand2);
    } else {
      throw new RuntimeException("illegal operator " + operator);
    }
  }

}