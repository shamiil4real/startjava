package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] intArr = {2, 4, 7, 6, 5, 3, 1};
        int len = intArr.length;

        System.out.print("До: ");
        printArray(intArr);

        for (int i = 0; i < len; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[len - 1];
            intArr[len - 1] = temp;
            len--;
        }

        System.out.print("\nПосле: ");
        printArray(intArr);

        System.out.println("\n\n2. Вывод произведения массива");

        int[] intArr2 = new int[10];
        len = intArr2.length;

        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }

        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= intArr2[i];
            String symbol = i != 8 ? " * " : " = " + product;
            System.out.print(intArr2[i] + symbol);
        }
        System.out.println("\nЧисло " + intArr2[0] + " с индексом " + 0 + "\n" +
                "Число " + intArr2[9] + " с индексом " + (len - 1));

        System.out.println("\n3. Удаление элементов массива\n");

        double[] doubleArr = new double[15];
        len = doubleArr.length;

        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printArray(doubleArr);

        int countCells = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > doubleArr[len / 2]) {
                doubleArr[i] = 0;
                countCells++;
            }
        }

        System.out.println("\nИзмененный массив:");
        printArray(doubleArr);

        System.out.println("\nКоличество обнуленных ячеек: " + countCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");

        char[] alphabet = new char[26];
        len = alphabet.length;

        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        int index = len - 2;
        for (int i = len - 1; i > - 1; i--) {
            for (int j = len - 1; j > index; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
            index--;
        }

        System.out.println("\n5. Генерация уникальных чисел\n");

        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;

        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            while (isUnique) {
                isUnique = false;
                int random = (int) (Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == random) {
                        isUnique = true;
                        break;
                    }
                }
                if (!isUnique) {
                    uniqueNumbers[i] = random;
                }
            }
        }

        Arrays.sort(uniqueNumbers);

        int rowCount = 0;
        for (int i = 0; i < len; i++) {
            if (rowCount == 10) {
                System.out.println();
                rowCount = 0;
            }
            System.out.print(uniqueNumbers[i] + " ");
            rowCount++;
        }

        System.out.println("\n\n6. Сдвиг элементов массива\n");

        String[] scrString = {"  ", "AA", "", "BBB", "CC", "D", "  ", "E", "FF", "G", ""};

        int countNotBlank = 0;
        for (String s : scrString) {
            if (!s.isBlank()) {
                countNotBlank++;
            }
        }

        String[] destString = new String[countNotBlank];

        index = 0;
        for (int i = 0; i < scrString.length; i++) {
            if (!scrString[i].isBlank()) {
                int j = i;
                while (!scrString[j].isBlank()) {
                    len++;
                    j++;
                }
                System.arraycopy(scrString, i, destString, index, len);
                i += len;
                index += len;
            }
            len = 0;
        }

        System.out.println("Оригинальный массив:");
        for (String s : scrString) {
            System.out.print(s + ", ");
        }

        System.out.println("\nНовый массив:");
        for (String s : destString) {
            System.out.print(s + ", ");
        }
    }

    private static void printArray(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    private static void printArray(double[] doubleArr) {
        for (int i = 0; i < doubleArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%4.3f %s", doubleArr[i], " ");
        }
    }
}
