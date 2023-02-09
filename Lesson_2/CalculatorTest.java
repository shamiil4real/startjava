import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String answer = new String();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calc.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: " );
            calc.setMathOperatore(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNumber2(scanner.nextInt());
            calc.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.next();

                if (answer.equals("no")) {
                    System.out.println("Программа завершена");
                    break;
                }
            } while (!answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}