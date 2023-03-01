package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);

        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String input = scanner.nextLine();
                showResult(calc.calculate(input));
            }

            System.out.print("Хотите продолжить вычисления? [yes/no] ");
            answer = scanner.next();
            scanner.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Программа завершена");
    }

    public static void showResult(double result) {
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}