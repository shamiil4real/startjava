package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void printArray(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    public static void printArray(double[] doubleArr) {
        for (int i = 0; i < doubleArr.length; i++) {
            if (i == 8) {
                System.out.println();
                ;
            }
            System.out.printf("%4.3f %s", doubleArr[i], " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] intArr = new int[] {2, 4, 7, 6, 5, 3, 1};

        System.out.print("До: ");
        ArrayTheme.printArray(intArr);

        for (int i = 0; i < intArr.length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length - (i + 1)];
            intArr[intArr.length - (i + 1)] = temp;
        }

        System.out.print("\nПосле: ");
        ArrayTheme.printArray(intArr);

        System.out.println("\n\n2. Вывод произведения массива");

        int[] intArr2 = new int[10];

        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = i;
        }

        int multiply = 1;
        for (int i = 1; i < intArr2.length - 1; i++) {
            multiply *= intArr2[i];
        }

        for (int i = 0; i < intArr2.length; i++) {
            if (i > 0 && i < 8) {
                System.out.print(intArr2[i] + " * ");
            } else if (i == 0 || i == 9) {
                System.out.println("\nЧисло " + intArr2[i] + " - индекс " + i);
            } else {
                System.out.print(intArr2[i] + " = " + multiply);
            }
        }

        System.out.println("\n3. Удаление элементов массива\n");

        double[] doubleArr = new double[15];

        for (int i = 0; i < doubleArr.length; i++) {
            double random = Math.random();
            doubleArr[i] = random;
        }

        System.out.println("Исходный массив:");
        ArrayTheme.printArray(doubleArr);

        double middleIndexNumber = doubleArr[doubleArr.length / 2];
        int countCells = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > middleIndexNumber) {
                doubleArr[i] = 0;
                countCells++;
            }
        }

        System.out.println("\nИзмененный массив:");
        ArrayTheme.printArray(doubleArr);

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

        int intArr4[] = new int[30];

        for (int i = 0; i < intArr4.length; i++) {
            boolean isDuplicate = true;
            while (isDuplicate) {
                isDuplicate = false;
                int random = (int) (Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (intArr4[j] == random) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    intArr4[i] = random;
                }
            }
        }

        Arrays.sort(intArr4);

        int rowCount = 0;
        for (int i = 0; i < intArr4.length; i++) {
            if (rowCount == 10) {
                System.out.println();
                rowCount = 0;
            }
            System.out.print(intArr4[i] + " ");
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
