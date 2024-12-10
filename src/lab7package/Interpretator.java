package lab7package;
/**
 * The Interpretator class provides functionality for parsing and interpreting
 * postfix mathematical expressions.
 */

import java.util.Stack;

public class Interpretator {

    /**
     * Parses a postfix expression and converts it into a chain of Expression objects.
     * The method supports numeric values and basic arithmetic operators: +, -, *, /.
     *
     * @param context A string representing the postfix mathematical expression.
     * @return The root Expression object representing the parsed expression.
     * @throws RuntimeException If an unknown operator is encountered.
     */

    public static int parseExpression(String context) {

        String[] tokens = context.split(" ");
        Stack<Expression> expresionStack = new Stack<>();
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                expresionStack.push(new Number(Integer.parseInt(token)));
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Expression right = expresionStack.pop();
                Expression left = expresionStack.pop();
                Expression operator = getOperator(token, left, right);
                expresionStack.push(operator);
            }
        }

        return expresionStack.pop().interpret();
    }

    /**
     * Resolves the operator string and creates the corresponding Expression object.
     *
     * @param operator The operator string ("+", "-", "*", "/").
     * @param left     The left operand.
     * @param right    The right operand.
     * @return An Expression object representing the operation.
     * @throws RuntimeException If an unknown operator is provided.
     */

    private static Expression getOperator(String operator, Expression left, Expression right) {

        return switch (operator) {
            case "+" -> new AddExpression(left, right);
            case "-" -> new SubExpression(left, right);
            case "*" -> new MultiplyExpression(left, right);
            case "/" -> new DivisionExpression(left, right);
            default -> throw new RuntimeException("Unknown operator");
        };
    }
}
