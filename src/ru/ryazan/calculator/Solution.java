package ru.ryazan.calculator;

import ru.ryazan.calculator.calculator.Calculator;
import ru.ryazan.calculator.calculator.SimpleOperator;
import ru.ryazan.calculator.exception.CalculateException;

public class Solution {
    public static void main(String[] args) {
        Calculator calculator = new SimpleOperator();

        ConsoleHelper.writeMessage("Простой калькулятор");

        ConsoleHelper.writeMessage("Введите первое число:");
        int first = ConsoleHelper.readInt();

        ConsoleHelper.writeMessage("Введите второе число:");
        int second = ConsoleHelper.readInt();

        ConsoleHelper.writeMessage("Введите операцию (+, -, *, /");
        try {
            ConsoleHelper.writeMessage(String.valueOf(calculator.calculate(first, second, ConsoleHelper.readOperator())));
        } catch (CalculateException e) {
            ConsoleHelper.writeMessage("Ошибка расчета. Сорри бро!");
        }

        ConsoleHelper.writeMessage("Конец работы программы. Нажми Enter для выхода");
        ConsoleHelper.read();
    }
}
