import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Postfix class implements an evaluator for integer postfix expressions.
 *
 * Postfix notation is a simple way to define and write arithmetic expressions
 * without the need for parentheses or priority rules. For example, the postfix
 * expression "1 2 - 3 4 + *" corresponds to the ordinary infix expression
 * "(1 - 2) * (3 + 4)". The expressions may contain decimal 32-bit integer
 * operands and the four operators +, -, *, and /. Operators and operands must
 * be separated by whitespace.
 *
 * @author Daniel Parmhed
 * @version 2023-02-01
 */
public class Postfix extends LinkedList<Integer> {
    public static class ExpressionException extends Exception {
        public ExpressionException(String message) {
            super(message);
        }
    }

    /**
     * Evaluates the given postfix expression.
     *
     * @param expr Arithmetic expression in postfix notation
     * @return The value of the evaluated expression
     * @throws ExpressionException if the expression is wrong
     */
    public static int evaluate(String expr) throws ExpressionException {

        if (expr.isEmpty()) {

            throw new ExpressionException(expr);
        }

        LinkedList<Integer> stack = new LinkedList<Integer>();

        ArrayList<String> words = new ArrayList<>();

        String[] splitterStrings = expr.split(" ");
        Collections.addAll(words, splitterStrings);
        int integerCounter = 0;
        int operatorCounter = 0;

        for(String element: words) {

            if(isInteger(element)) {

                integerCounter++;


            }else if (isOperator(element)) {

                operatorCounter++;
            }else if (element.matches("[a-z]")) {

                throw new ExpressionException(expr);
            }

        }

        if(integerCounter != operatorCounter + 1) {

            throw new ExpressionException(expr);
        }

        String split = "";
        String invalidInput = "";

        int popped1 = 0;
        int popped2 = 0;
        int sum = 0;

        for (int i = 0; i < words.size(); i++) {


            split += words.get(i);

            if(split.length() > 1) {

                invalidInput += split.charAt(0);

                if(invalidInput.matches("0")) {

                    throw new ExpressionException(split);
                }else if(invalidInput.matches("-")) {

                    invalidInput += split.charAt(1);

                    if(invalidInput.matches("-0") && split.length() > 2) {

                        throw new ExpressionException(split);
                    }
                }
            } 

            

            if (isInteger(split)) {

                try {
                    int parsedInt = Integer.parseInt(split);
                    stack.push(parsedInt);
                } catch (NumberFormatException e) {
                    
                    throw new ExpressionException(split);
                }
                
                

            } else if (isOperator(split)) {

                if (stack.isEmpty() || stack.size() == 1) {

                    throw new ExpressionException(expr);

                } else {

                    popped1 = stack.pop();
                    popped2 = stack.pop();

                }

                if (split.matches("^[+]$")) {

                    stack.push(popped2 + popped1);

                } else if (split.matches("^[-]$")) {

                    stack.push(popped2 - popped1);
                } else if (split.matches("^[*]$")) {

                    stack.push(popped2 * popped1);
                } else if (split.matches("^[/]$")) {

                    if (popped1 == 0) {
                        throw new ExpressionException(expr);
                    } else {
                        stack.push(popped2 / popped1);
                    }
                }

            }

            split = "";

        }

        sum = stack.pop();
        return sum;

    }

    /**
     * Returns true if s is an operator.
     *
     * A word of caution on using the String.matches method: it returns true
     * if and only if the whole given string matches the regex. Therefore
     * using the regex "[0-9]" is equivalent to "^[0-9]$".
     *
     * An operator is one of '+', '-', '*', '/'.
     */
    private static boolean isOperator(String s) {

        Pattern pattern = Pattern.compile("^[+-/*]$");
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();

        if (matchFound == true) {

            return true;

        } else {

            return false;
        }
    }

    /**
     * Returns true if s is an integer.
     *
     * A word of caution on using the String.matches method: it returns true
     * if and only if the whole given string matches the regex. Therefore
     * using the regex "[0-9]" is equivalent to "^[0-9]$".
     *
     * We accept two types of integers:
     *
     * - the first type consists of an optional '-'
     * followed by a non-zero digit
     * followed by zero or more digits,
     *
     * - the second type consists of an optional '-'
     * followed by a single '0'.
     */
    private static boolean isInteger(String s) {

        Pattern pattern = Pattern.compile("^-?[0-9][1-9]*");
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();

        if (matchFound == true) {

            return true;

        } else {

            return false;
        }

    }
}