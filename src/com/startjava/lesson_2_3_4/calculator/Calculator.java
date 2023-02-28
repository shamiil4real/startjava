package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private String[] mathOperation;
    private int number1;
    private int number2;
    private char mathOperatore;
    private double result;

    public double calculate(String input) {
        String[] mathOperation = input.split(" ");
        number1 = Integer.parseInt(mathOperation[0]);
        number2 = Integer.parseInt(mathOperation[2]);
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