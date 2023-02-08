import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator test = new Calculator();

        do {
            Scanner firstNumberScanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            test.setFirstNumber(firstNumberScanner.nextInt());

            Scanner mathOperatorScanner = new Scanner(System.in);
            System.out.print("Введите знак математической операции: " );
            test.setMathOperatore(mathOperatorScanner.next().charAt(0));

            Scanner secondNumberScanner = new Scanner(System.in);
            System.out.print("Введите второе число: ");
            test.setSecondNumber(secondNumberScanner.nextInt());

            test.calculate();

            do {
                Scanner scannerAnswer = new Scanner(System.in);
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                test.setAnswer(scannerAnswer.nextLine());

                if (test.getAnswer().equals("no")) {
                    System.out.println("Программа завершена");
                    break;
                }
            } while (!test.getAnswer().equals("yes"));
        } while (test.getAnswer().equals("yes"));
    }
}