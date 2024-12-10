package lab7package;

/**
 * The AddExpression class represents an addition operation in the expression tree.
 */

public class AddExpression implements Expression {

    private Expression left;

    private Expression right;

    /**
     * Constructs an AddExpression with left and right operands.
     *
     * @param left  The left operand.
     * @param right The right operand.
     */

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the addition of the left and right expressions.
     * @return The result of the addition.
     */

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();

    }

}
