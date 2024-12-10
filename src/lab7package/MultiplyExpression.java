package lab7package;

/**
 * The MultiplyExpression class represents a multiplication operation in the expression tree.
 */

public class MultiplyExpression implements Expression {

    private Expression left;

    private Expression right;

    /**
     * Constructs a MultiplyExpression with left and right operands.
     *
     * @param left  The left operand.
     * @param right The right operand.
     */

    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the multiplication of the left and right expressions.
     * @return The result of the multiplication.
     */

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();

    }

}
