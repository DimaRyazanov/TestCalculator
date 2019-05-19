package ru.ryazan.calculator.calculator;

import ru.ryazan.calculator.Operator;
import ru.ryazan.calculator.exception.CalculateException;

public class SimpleOperator implements Calculator {
    @Override
    public int calculate(int first, int second, Operator operator) throws CalculateException {
        switch (operator){
            case ADDITION: return first + second;
            case SUBTRACTION: return first - second;
            case MULTIPLICATION: return first * second;
            case DIVISION: return first / second;
        }

        throw new CalculateException();
    }
}
