package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void printArray(int[] numsArr) {
        for (int i : numsArr) {
            System.out.print(i + " ");
        }
    }

    public static void printArray(double[] doublesArr) {
        for (int i = 0; i < doublesArr.length; i++) {
            if (i == 8) {
                System.out.println();
                ;
            }
            System.out.printf("%4.3f %s", doublesArr[i], " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] numsArr = new int[] {2, 4, 7, 6, 5, 3, 1};

        System.out.print("До: ");
        ArrayTheme.printArray(numsArr);

        for (int i = 0; i < numsArr.length / 2; i++) {
            int temp = numsArr[i];
            numsArr[i] = numsArr[numsArr.length - (i + 1)];
            numsArr[numsArr.length - (i + 1)] = temp;
        }

        System.out.print("\nПосле: ");
        ArrayTheme.printArray(numsArr);

        System.out.println("\n\n2. Вывод произведения массива");

        int[] numsArr2 = new int[10];

        for (int i = 0; i < numsArr2.length; i++) {
            numsArr2[i] = i;
        }

        int multiply = 1;
        for (int i = 1; i < numsArr2.length - 1; i++) {
            multiply *= numsArr2[i];
        }

        for (int i = 0; i < numsArr2.length; i++) {
            if (i > 0 && i < 8) {
                System.out.print(numsArr2[i] + " * ");
            } else if (i == 0 || i == 9) {
                System.out.println("\nЧисло " + numsArr2[i] + " - индекс " + i);
            } else {
                System.out.print(numsArr2[i] + " = " + multiply);
            }
        }

        System.out.println("\n3. Удаление элементов массива\n");

        double[] doublesArr = new double[15];

        for (int i = 0; i < doublesArr.length; i++) {
            double random = Math.random();
            doublesArr[i] = random;
        }

        System.out.println("Исходный массив:");
        ArrayTheme.printArray(doublesArr);

        double middleIndexNumber = doublesArr[doublesArr.length / 2];
        int countCells = 0;
        for (int i = 0; i < doublesArr.length; i++) {
            if (doublesArr[i] > middleIndexNumber) {
                doublesArr[i] = 0;
                countCells++;
            }
        }

        System.out.println("\nИзмененный массив:");
        ArrayTheme.printArray(doublesArr);

        System.out.println("\nКоличество обнуленных ячеек: " + countCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");

        char[] charArr = new char[26];
        int index = 0;

        for (int i = 65; i < 91; i++) {
            charArr[index] = (char) i;
            index++;
        }

        int temp = charArr.length - 2;
        for (int i = charArr.length - 1; i > -1; i--) {
            for (int j = charArr.length -1; j > temp; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
            temp--;
        }

        System.out.println("\n5. Генерация уникальных чисел\n");

        int numsArr4[] = new int[30];

        for (int i = 0; i < numsArr4.length; i++) {
            boolean isDuplicate = true;
            while (isDuplicate) {
                isDuplicate = false;
                int random = (int) (Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (numsArr4[j] == random) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    numsArr4[i] = random;
                }
            }
        }

        Arrays.sort(numsArr4);

        int rowCount = 0;
        for (int i = 0; i < numsArr4.length; i++) {
            if (rowCount == 10) {
                System.out.println();
                rowCount = 0;
            }
            System.out.print(numsArr4[i] + " ");
            rowCount++;
        }

        System.out.println("\n\n6. Сдвиг элементов массива\n");

        String[] stringArr = new String[] {"  ", "AA", "", "BBB", "CC", "D", "  ", "E", "FF", "G", ""};

        int arrLength = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if(!stringArr[i].isBlank()){
                arrLength++;
            }
        }

        String[] stringArr2 = new String[arrLength];
        System.arraycopy(stringArr, 1, stringArr2, 0, 1);
        System.arraycopy(stringArr, 3, stringArr2, 1, 3);
        System.arraycopy(stringArr, 7, stringArr2, 4, 3);

        System.out.println("Оригинальный массив:");
        for (String s : stringArr2) {
            System.out.print(s + ", ");
        }

        System.out.println("\nСкопированный массив:");
        for (String s : stringArr2) {
            System.out.print(s + ", ");
        }
    }
}
