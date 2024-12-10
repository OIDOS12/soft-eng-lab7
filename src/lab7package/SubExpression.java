package lab7package;

/**
 * The SubExpression class represents a subtraction operation in the expression tree.
 */

public class SubExpression implements Expression {

    private Expression left;

    private Expression right;

    /**
     * Constructs a SubExpression with left and right operands.
     *
     * @param left  The left operand.
     * @param right The right operand.
     */

    public SubExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the subtraction of the left and right expressions.
     * @return The result of the subtraction.
     */

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();

    }

}
