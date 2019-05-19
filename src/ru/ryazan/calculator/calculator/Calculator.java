package ru.ryazan.calculator.calculator;

import ru.ryazan.calculator.Operator;
import ru.ryazan.calculator.exception.CalculateException;

public interface Calculator {
    int calculate(int first, int second, Operator operator) throws CalculateException;
}
