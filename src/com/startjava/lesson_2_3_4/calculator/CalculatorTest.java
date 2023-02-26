package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);

        do {
            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.next();
                scanner.nextLine();
                continue;
            }

            System.out.print("Введите математическое выражение: ");
            String input = scanner.nextLine();
            Calculator calc = new Calculator(input);
            String[] mathOperation = input.split(" ");

            calc.setNumber1(Integer.parseInt(mathOperation[0]));
            calc.setNumber2(Integer.parseInt(mathOperation[2]));
            calc.setMathOperatore(mathOperation[1].charAt(0));
            calc.calculate();

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.next();
            scanner.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Программа завершена");
    }
}