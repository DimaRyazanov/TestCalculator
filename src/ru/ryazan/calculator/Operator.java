package ru.ryazan.calculator;

import ru.ryazan.calculator.exception.CastCharToException;

public enum Operator {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION;

    public static Operator parseOperator(char charOperator) throws CastCharToException {
        switch (charOperator){
            case '+': return Operator.ADDITION;
            case '-': return Operator.SUBTRACTION;
            case '*': return Operator.MULTIPLICATION;
            case '/': return Operator.DIVISION;
            default:
                throw new CastCharToException();
        }
    }
}
