package ru.ryazan.calculator.calculator;

import ru.ryazan.calculator.Operator;
import ru.ryazan.calculator.exception.CalculateException;

public class SimpleCalculator implements Calculator {
    @Override
    public int calculate(int first, int second, Operator operator) throws CalculateException {
        switch (operator){
            case ADDITION: return first + second;
            case SUBTRACTION: return first - second;
            case MULTIPLICATION: return first * second;
            case DIVISION:  if (second == 0) throw new CalculateException("Деление на 0");
                return first / second;
        }

        throw new CalculateException("Ошибка: неизвестная операция");
    }
}
