package com.startjava.lesson_2_3_4.calculator;

import java.sql.SQLOutput;

public class Calculator {
    private String mathOperation;

    private double number1;
    private double number2;
    private char mathOperatore;
    private double result;

    public Calculator (String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathOperatore(char mathOperatore) {
        this.mathOperatore = mathOperatore;
    }

    public void calculate() {
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

        if (result % 1 == 0.0) {
            System.out.println(String.format("%.0f", result));
        } else {
            System.out.println(result);
        }
    }
}