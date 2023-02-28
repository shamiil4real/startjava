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

                if (calc.calculate(input) % 1 == 0.0) {
                    System.out.println((int)calc.calculate(input));
                } else {
                    System.out.println(calc.calculate(input));
                }
            }

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.next();
            scanner.nextLine();

            if (answer.equals("no")) {
                break;
            }
        } while (true);

        System.out.println("Программа завершена");
    }
}