package lab7package;

/**
 * The Number class represents a numeric value in the expression tree.
 */

public class Number implements Expression {
    private int value;

    /**
     * Constructs a Number with the given value.
     *
     * @param value The integer value to represent.
     */

    public Number(int value) {
        this.value = value;
    }

    /**
     * Returns the numeric value.
     * @return The numeric value.
     */

    @Override
    public int interpret() {
        return value;
    }
}
