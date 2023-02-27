package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private String[] mathOperation;
    private double number1;
    private double number2;
    private char mathOperatore;
    private double result;

    public double calculate(String input) {
        String[] mathOperation = input.split(" ");
        number1 = Double.parseDouble(mathOperation[0]);
        number2 = Double.parseDouble(mathOperation[2]);
        mathOperatore = mathOperation[1].charAt(0);

        result = 1;
        switch(mathOperatore) {
            case '+':
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '^' :
                result = Math.pow(number1, number2);
                break;
            case '%' :
                result = number1 % number2;
                break;
            default :
                System.out.println("Вы указали некорректный математический символ");
        }
        return result;
    }
}