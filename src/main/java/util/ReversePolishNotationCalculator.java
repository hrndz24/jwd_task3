package util;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotationCalculator {

    public int calculate(String expression) {
        expression = changeShiftOperatorsToOneSymbol(expression);

        Deque<Character> operations = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();
        int i = 0;
        char symbol;
        while (i < expression.length()) {
            symbol = expression.charAt(i);
            if (isDigit(symbol)) {
                StringBuilder number = new StringBuilder();
                while (i < expression.length() && isDigit(symbol = expression.charAt(i))) {
                    number.append(symbol);
                    i++;
                }
                result.push(Integer.valueOf(number.toString()));
            } else {
                if (operations.isEmpty() || getPriority(symbol) < getPriority(operations.peek())) {
                    operations.push(symbol);
                } else {
                    if (symbol != ')') {
                        while (!operations.isEmpty() && operations.peek() != '(' &&
                                getPriority(symbol) > getPriority(operations.peek())) {
                            calculate(operations.pop(), result);
                        }
                        operations.push(symbol);
                    } else {
                        while (operations.peek() != null && operations.peek() != '(') {
                            calculate(operations.pop(), result);
                        }
                        operations.pop();
                    }
                }
                i++;
            }
        }
        while (!operations.isEmpty()) {
            calculate(operations.pop(), result);
        }

        return result.pop();
    }

    private void calculate(char operation, Deque<Integer> result) {
        int firstNumber;
        int secondNumber;
        switch (operation) {
            case '~':
                firstNumber = result.pop();
                result.push(~firstNumber);
                return;
            case '&':
                firstNumber = result.pop();
                secondNumber = result.pop();
                result.push(firstNumber & secondNumber);
                return;
            case '|':
                firstNumber = result.pop();
                secondNumber = result.pop();
                result.push(firstNumber | secondNumber);
                return;
            case '>':
                firstNumber = result.pop();
                secondNumber = result.pop();
                result.push(secondNumber >> firstNumber);
                return;
            case '<':
                firstNumber = result.pop();
                secondNumber = result.pop();
                result.push(secondNumber << firstNumber);
                return;
            case '^':
                firstNumber = result.pop();
                secondNumber = result.pop();
                result.push(firstNumber ^ secondNumber);
        }
    }

    private int getPriority(char symbol) {
        switch (symbol) {
            case '(':
                return 0;
            case '~':
                return 1;
            case '>':
            case '<':
                return 2;
            case '&':
                return 3;
            case '^':
                return 4;
            case '|':
                return 5;
            default:
                return 15;
        }
    }

    private boolean isDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private String changeShiftOperatorsToOneSymbol(String expression) {
        expression = expression.replace(">>", ">");
        return expression.replace("<<", "<");
    }
}
