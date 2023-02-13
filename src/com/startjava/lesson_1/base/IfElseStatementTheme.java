package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 100;
        boolean isMan = true;
        float height = 2.20f;

        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам меньше 20 лет");
        }

        if (!isMan) {
            System.out.println("Вы не мужского пола");
        } else {
            System.out.println("Вы мужского пола");
        }

        if (height < 1.80) {
            System.out.println("Ваш рост меньше 180 см");
        } else {
            System.out.println("Ваш рост больше 180 см");
        }

        char firstLetterOfName = "Миша".charAt(0);
        if (firstLetterOfName == 'М') {
            System.out.println("Возможно, вас зовут Михаил");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Возможно, вас зовут Inna");
        } else {
            System.out.println("Вероятно, вас зовут не Миша или Inna");
        }

        System.out.println("\n2. Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println(num1 + " - максимальное число");
            System.out.println(num2 + " - минимальное число");
        } else if (num1 < num2) {
            System.out.println(num2 + " - максимальное число");
            System.out.println(num1 + " - минимальное число");
        } else {
            System.out.println("Числа: " + num1 + ", " + num2 + " - равны");
        }

        System.out.println("\n3. Проверка числа\n");

        int num3 = 0;

        if (num3 == 0) {
            System.out.print("Данное число - " + num3);
        } else if (num3 % 2 == 0) {
            System.out.print(num3 + " - четное");
        } else {
            System.out.print(num3 + " - нечетное");
        }

        if (num3 > 0) {
            System.out.print(" положительное число");
        } else if (num3 < 0) {
            System.out.print(" отрицательное число");
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int num4 = 267;
        int num5 = 257;

        int num4Hundreds = num4 / 100;
        int num4Tens = (num4 % 100) / 10;
        int num4Ones = num4 % 10;

        int num5Hundreds = num5 / 100;
        int num5Tens = (num5 % 100) / 10;
        int num5Ones = num5 % 10;

        System.out.println("Исходные числа: " + num4 +", " + num5);

        System.out.print("Одинаковые в них цифры: ");
        if (num4Hundreds == num5Hundreds) {
            System.out.print(num4Hundreds + " - 3ий разряд; ");
        }
        if (num4Tens == num5Tens) {
            System.out.print(num4Tens + " - 2ой разряд; ");
        }
        if (num4Ones == num5Ones) {
            System.out.print(num4Ones + " - 1ый разряд;");
        }
        if (num4Hundreds != num5Hundreds && num4Tens != num5Tens && num4Ones != num5Ones) {
            System.out.print(" отсутствуют");
        }

        System.out.println("\n\n5. Определение символа по его коду\n");

        char symbol = '\u0057';

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - это маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - это большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + "- это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 300000;
        int percent = 5;

        if (deposit >= 100000 & deposit <= 300000) {
            percent = 7;
        } else if (deposit > 300000) {
            percent = 10;
        }

        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Начисленный процент = " + (deposit / 100 * percent));
        System.out.println("Итоговая сумма с процентами = " + (deposit / 100 * percent + deposit));

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;

        if (historyPercent > 60 && historyPercent < 73) {
            historyGrade = 3;
        } else if (historyPercent >= 73 && historyPercent < 91) {
            historyGrade = 4;
        } else if (historyPercent >= 91) {
            historyGrade = 5;
        }

        if (programmingPercent > 60 && programmingPercent < 73) {
            programmingGrade = 3;
        } else if (programmingPercent >= 73 && programmingPercent < 91){
            programmingGrade = 4;
        } else if (programmingPercent >= 91) {
            programmingGrade = 5;
        }

        System.out.println(historyGrade + " история");
        System.out.println(programmingGrade + " программирование");
        System.out.println("Средний балл по предметам = " + (historyGrade + programmingGrade) / 2);
        System.out.println("Средний процент по предметам = " + (historyPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли за год\n");

        int rent = 5000;
        int income = 13000;
        int costPrice = 9000;
        int profit = (income - rent - costPrice) * 12;

        if (profit > 0) {
            System.out.println("+" + profit);
        } else {
            System.out.println(profit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");

        int money = 567;

        int hundredsHave = 10;
        int tensHave = 5;
        int onesHave = 50;

        int hundredsNeed = money / 100;
        int tensNeed = money % 100 / 10;
        int onesNeed = money % 10;

        int hundredsCount = 0;
        int tensCount = 0;
        int onesCount = 0;

        boolean isEnoughMoney = money <= (hundredsHave * 100 + tensHave * 10 + onesHave);

        if (!isEnoughMoney) {
            System.out.println("Извините, у нас не хватает купюр");
        } else {
            hundredsCount = hundredsHave;
            tensCount = tensHave;
            onesCount = onesHave;

            if (money < hundredsHave * 100 + tensHave * 10 + onesHave) {
                if (hundredsNeed > hundredsHave) {
                    hundredsCount = hundredsHave;
                    tensNeed = (hundredsNeed - hundredsHave) * 10;
                    tensCount = tensNeed;
                    money -= hundredsHave * 100 + tensNeed * 10;
                } else if (hundredsNeed <= hundredsHave) {
                    money -= 100 * hundredsNeed;
                    hundredsCount = hundredsNeed;
                }

                if (tensNeed > tensHave) {
                    tensCount = tensHave;
                    onesNeed = money - tensHave * 10;
                    onesCount = onesNeed;
                } else if (tensNeed <= tensHave) {
                    tensCount = tensNeed;
                    onesCount = onesNeed;
                }
            }

            System.out.println("Количество сотен: " + hundredsCount);
            System.out.println("Количество десятков: " + tensCount);
            System.out.println("Количество единиц: " + onesCount);
            System.out.println("Выдаваемая сумма = " + (hundredsCount * 100 + tensCount * 10 + onesCount));
        }
    }
}