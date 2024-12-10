package lab7package;

/**
 * The DivisionExpression class represents a division operation in the expression tree.
 */

public class DivisionExpression implements Expression {

    private Expression left;

    private Expression right;

    /**
     * Constructs a DivisionExpression with left and right operands.
     *
     * @param left  The left operand.
     * @param right The right operand.
     */

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the division of the left expression by the right expression.
     * @return The result of the division.
     */

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();

    }

}
