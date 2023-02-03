public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int counter = -10;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter < 22);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }

        if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num1 && num3 < num2) {
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

        int countRows = 0;
        for (int i = 1; i < 25; i += 2) {
            System.out.printf("%4d", i);
            countRows++;
            if (countRows == 5) {
                System.out.println();
                countRows = 0;
            }
        }

        if (countRows < 5) {
            for (int i = 0; i < 5 - countRows; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        int srcNum2 = 3242592;
        int copySrcNum2 = srcNum2;
        int countTwo = 0;

        while (srcNum2 > 0) {
            if ((srcNum2 - 2) % 10 == 0) {
                countTwo++;
            }
            srcNum2 /= 10;
        }

        if (countTwo % 2 == 0) {
            System.out.println("Число " + copySrcNum2 + " содержит четное количество двоек");
        } else {
            System.out.println("Число " + copySrcNum2 + " содержит нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");

        char asterisk = '*';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
        System.out.println();

        char hash = '#';
        int rows = 5;
        int columns = 0;
        while (columns < 5) {
            int i = rows;
            while(i > 0){
                System.out.print(hash);
                i--;
            }
            System.out.println();
            rows--;
            columns++;
        }
        System.out.println();

        char dollar = '$';
        int columns2 = 0;
        int rows2 = 1;
        do {
            int i = 0;
            do {
                System.out.print(dollar);
                i++;
            } while (i < rows2);
            System.out.println();
            columns2++;
            if (columns2 > 2) {
                rows2--;
            } else {
                 rows2++;
            }
        } while (columns2 < 5);

        System.out.println("\n7. Отображение ASII-символов\n");

        System.out.println(" Dec | Char");
        System.out.println(" ----------");
        for (int i = 33; i < 122; i++) {
            if (i >= 33 && i <= 47 && i % 2 > 0) {
                System.out.printf("%4d", (int) i);
                System.out.print(" | ");
                System.out.printf("%3c", (char) i);
                System.out.println("\n ----------");
            }

            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%4d", (int) i);
                System.out.print(" | ");
                System.out.printf("%3c", (char) i);
                System.out.println("\n ----------");
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int polindrom = 1234321;

        int sum2 = 0;
        int copyPolindrom = polindrom;

        while (polindrom > 0) {
            int remainder2 = polindrom % 10;
            sum2 = (sum2 * 10) + remainder2;
            polindrom /= 10;
        }

        if (copyPolindrom == sum2) {
            System.out.println("Число " + copyPolindrom + " является палиндромом");
        } else {
            System.out.println("Число " + copyPolindrom + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        int luckyNum = 123312;
        int firstNums = luckyNum % 1000;
        int lastNums = luckyNum / 1000;
        int firstNumsSum = 0;
        int lastNumsSum = 0;

        for (int i = 0; i < 6; i++) {
            int remainder3 = luckyNum % 10;
            if (i < 3) {
                firstNumsSum += remainder3;
            } else {
                lastNumsSum += remainder3;
            }
            luckyNum /= 10;
        }

        System.out.println("Сумма цифр " + firstNums + " = " + firstNumsSum + "; Сумма цифр " + lastNums + " = " + lastNumsSum);

        if (firstNumsSum == lastNumsSum) {
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