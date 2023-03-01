package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private String[] mathOperation;
    private int number1;
    private int number2;
    private char mathSign;

    public double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        number1 = Integer.parseInt(partsExpression[0]);
        number2 = Integer.parseInt(partsExpression[2]);
        mathSign = partsExpression[1].charAt(0);

        switch(mathSign) {
            case '+':
                return number1 + number2;
            case '-' :
                return number1 - number2;
            case '*' :
                return number1 * number2;
            case '/' :
                return number1 / number2;
            case '^' :
                return Math.pow(number1, number2);
            case '%' :
                return number1 % number2;
            default :
                System.out.println("Вы указали некорректный математический символ");
                return 0;
        }
    }
}