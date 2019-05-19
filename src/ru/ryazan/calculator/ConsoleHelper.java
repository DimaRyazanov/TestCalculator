package ru.ryazan.calculator;

import ru.ryazan.calculator.exception.CastCharToException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String read(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            writeMessage("Ошибка чтения строки: попробуйте еще раз");
            return read();
        }
    }

    public static int readInt(){
        try {
            return Integer.parseInt(read());
        } catch (NumberFormatException e) {
            writeMessage("Введено не целое число: попробуйте еще раз");
            return readInt();
        }
    }

    public static Operator readOperator(){
        String operator = read();
        if (operator.length() > 1){
            writeMessage("Длина оператора более 1: введите еще раз.");
            return readOperator();
        }else{

            try {
                char charOperator = operator.charAt(0);
                return Operator.parseOperator(charOperator);
            } catch (CastCharToException e) {
                writeMessage("Введеный оператор не из списка: Попробуйте снова");
                return readOperator();
            }
        }
    }

}
