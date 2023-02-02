public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int num1 = -10;
        int evenCount = 0;
        int oddCount = 0;

        do {
            if (num1 % 2 == 0) {
                evenCount += num1;
            } else {
                oddCount += num1;
            }
            num1++;
        } while (num1 < 22);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenCount + ", а нечетных = " + oddCount);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int numA = 10;
        int numB = 5;
        int numC = -1;

        int max = 0;
        int min = 0;

        if (numA > numB && numA > numC) {
            max = numA;
        } else if (numB > numC && numB > numC) {
            max = numB;
        } else if (numC > numA && numB > numA) {
            max = numC;
        }

        if (numA < numB && numA < numC) {
            min = numA;
        } else if (numB < numC && numB < numC) {
            min = numB;
        } else {
            min = numC;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int numK = 1234;
        int k = 0;
        int sumK = 0;

        while (numK > 0) {
            k = numK % 10;
            sumK += k;
            System.out.print(k);
            numK /= 10;
        }

        System.out.println("\nСумма цифр = " + sumK);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int rowCount = 0;
        for (int i = 1; i < 25; i += 2) {
            System.out.printf("%4d", i);
            rowCount++;
            if (rowCount == 5) {
                System.out.println("");
                rowCount = 0;
            }
        }

        if (rowCount != 5) {
            for (int c = 0; c < 5 - rowCount; c++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        int numX = 3242592;
        int numXCopy = numX;
        int twoCount = 0;

        while (numX > 0) {
            if ((numX - 2) % 10 == 0) {
                twoCount++;
            }
            numX /= 10;
        }

        if (twoCount % 2 == 0) {
            System.out.println("Число " + numXCopy + " содержит четное количество двоек");
        } else {
            System.out.println("Число " + numXCopy + " содержит нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");

        char asterisk = '*';
        for (int i = 0; i < 5; i++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(asterisk);
            }
            System.out.println("");
        }
        System.out.println("");

        char hash = '#';
        int row = 5;
        int column = 0;
        while (column < 5) {
            int j = row;
            while(j > 0){
                System.out.print(hash);
                j--;
            }
            System.out.println("");
            row--;
            column++;
        }
        System.out.println("");

        char dollar = '$';
        int column2 = 0;
        int row2 = 1;
        do {
            int i = 0;
            do {
                System.out.print(dollar);
                i++;
            } while (i < row2);
            System.out.println("");
            column2++;
            if (column2 > 2) {
                row2--;
            } else {
                 row2++;
            }
        } while (column2 < 5);

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

        int luckyNum = 1234321;

        int w = 0;
        int wSum = 0;
        int luckyNumCopy = luckyNum;

        while (luckyNum > 0) {
            w = luckyNum % 10;
            wSum = (wSum * 10) + w;
            luckyNum /= 10;
        }

        if (luckyNumCopy == wSum) {
            System.out.println("Число " + luckyNumCopy + " является палиндромом");
        } else {
            System.out.println("Число " + luckyNumCopy + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        int numJ = 123312;
        int j = 0;
        int firstNums = numJ % 1000;
        int lastNums = numJ / 1000;
        int firstNumsSum = 0;
        int lastNumsSums = 0;

        for (int i = 0; i < 6; i++) {
            j = numJ % 10;
            if (i < 3) {
                firstNumsSum += j;
            } else {
                lastNumsSums += j;
            }
            numJ /= 10;
        }

        System.out.println("Сумма цифр " + firstNums + " = " + firstNumsSum + "; Сумма цифр " + lastNums + " = " + lastNumsSums);

        if (firstNumsSum == lastNumsSums) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        for (int i = 1; i < 10; i++) {
            for (int m  = 1; m < 10; m++) {
                System.out.printf("%4d", i * m);
                if (m == 1) {
                System.out.printf("%2c",'|');
                }
            }
            if (i == 1) {
                System.out.println("\n   -----------------------------------");
            } else {
                System.out.println("");
            }
        }
    }
}