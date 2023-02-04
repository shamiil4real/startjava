public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter < 22);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num2;

        if (num3 > max) {
            max = num3;
        } else if (num2 > max) {
            max = num2;
        }

        if (num1 < min) {
            min = num1;
        } else if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int srcNum = 1234;
        int sum = 0;

        while (srcNum > 0) {
            int remainder = srcNum % 10;
            sum += remainder;
            System.out.print(remainder);
            srcNum /= 10;
        }

        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int numsInRow = 0;
        for (int i = 1; i < 25; i += 2) {
            System.out.printf("%4d", i);
            numsInRow++;
            if (numsInRow == 5) {
                System.out.println();
                numsInRow = 0;
            }
        }

        if (numsInRow < 5) {
            for (int i = 0; i < 5 - numsInRow; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        int srcNum2 = 3242592;
        int copySrcNum2 = srcNum2;
        int countTwos = 0;

        while (srcNum2 > 0) {
            if (srcNum2 % 10 == 2) {
                countTwos++;
            }
            srcNum2 /= 10;
        }

        if (countTwos % 2 == 0) {
            System.out.println("Число " + copySrcNum2 + " содержит четное количество двоек");
        } else {
            System.out.println("Число " + copySrcNum2 + " содержит нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int rows = 5;
        int columns = 0;
        while (rows > 0) {
            int countColumns = columns;
            while (countColumns < 5) {
                System.out.print('#');
                countColumns++;
            }
            System.out.println();
            rows--;
            columns++;
        }
        System.out.println();

        columns = 0;
        rows = 1;
        do {
            int countRows = 0;
            do {
                System.out.print('$');
                countRows++;
            } while (countRows < rows);
            System.out.println();
            columns++;
            if (columns > 2) {
                rows--;
            } else {
                 rows++;
            }
        } while (columns < 5);

        System.out.println("\n7. Отображение ASII-символов\n");

        System.out.println(" Dec | Char" + "\n ----------");
        for (int i = 1; i <= 127; i++) {
            if (i >= '!' && i <= '/' && i % 2 > 0) {
                System.out.printf("%4d %c %2c %s", i, '|', i, "\n ----------\n");
            }

            if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d %c %2c %s", i, '|', i, "\n ----------\n");
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int polindrom = 1234321;

        int sum2 = 0;
        int copyPolindrom = polindrom;

        while (polindrom > 0) {
            int remainder = polindrom % 10;
            sum2 = (sum2 * 10) + remainder;
            polindrom /= 10;
        }

        if (copyPolindrom == sum2) {
            System.out.println("Число " + copyPolindrom + " является палиндромом");
        } else {
            System.out.println("Число " + copyPolindrom + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        int luckyNum = 123312;

        int leftHalfNum = luckyNum % 1000;
        int rightHalfNum = luckyNum / 1000;

        int sumLeftHalfDigits = 0;
        int sumRightHalfDigits = 0;

        for (int i = 0; i < 6; i++) {
            int remainder = luckyNum % 10;
            if (i < 3) {
                sumLeftHalfDigits += remainder;
            } else {
                sumRightHalfDigits += remainder;
            }
            luckyNum /= 10;
        }

        System.out.println("Сумма цифр " + leftHalfNum + " = " + sumLeftHalfDigits + "\n" +
                "Сумма цифр " + rightHalfNum + " = " + sumRightHalfDigits);

        if (sumLeftHalfDigits == sumRightHalfDigits) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        for (int i = 1; i < 10; i++) {
            for (int j  = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
                if (j == 1) {
                    System.out.printf("%2c",'|');
                }
            }

            if (i == 1) {
                System.out.println("\n   -----------------------------------");
            } else {
                System.out.println();
            }
        }
    }
}