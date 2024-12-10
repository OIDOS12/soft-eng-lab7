package lab7package;

/**
 * The Main class serves as the entry point of the application.
 * It demonstrates the usage of the Interpreter pattern for evaluating a postfix mathematical expression.
 */

public class Main {

    /**
     * The main method executes the application logic.
     *
     * @param args Command-line arguments passed to the application.
     */

    public static void main(String[] args) {
        String expression = "4 5 + 9 *";
        int result = Interpretator.parseExpression(expression);
        System.out.println(result);
    }

}


