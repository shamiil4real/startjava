package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char mathOperatore;
    private long result;

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
            case '+' :
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
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
            case '%' :
                result = number1 % number2;
                break;
            default :
                System.out.println("Вы указали некорректный математический символ");
                return;
        }

        System.out.println(number1 + " " + mathOperatore + " " + number2 + " = " + result);
    }
}