public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.  Перевод псевдокода на язык Java\n");

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

        System.out.println("\n2.  Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println(num1 + " - максимальное число");
            System.out.println(num2 + " - минимальное число");
        } else if (num1 < num2) {
            System.out.println(num2 + " - максимальное число");
            System.out.println(num1 + " - минимальное число");
        } else if (num1 == num2) {
            System.out.println("Данные числа равны");
        }

        System.out.println("\n3.  Проверка числа\n");

        int num3 = 0;

        if (num3 == 0) {
            System.out.println(num3 + " - является нулем");
        } else if (num3 != 0 && num3 % 2 == 0) {
            System.out.println(num3 + " - это четное число");
        } else if (num3 != 0 && num3 % 2 > 0) {
            System.out.println(num3 + " - это нечетное число");
        }

        System.out.println("\n4.  Поиск одинаковых цифр в числах\n");

        int num4 = 202;
        int num5 = 215;

        int num4Hundred = num4 / 100;
        int num4Ten = (num4 % 100) / 10;
        int num4Unit = num4 % 10;

        int num5Hundred = num5 / 100;
        int num5Ten = (num5 % 100) / 10;
        int num5Unit = num5 % 10;

        System.out.println("Исходные числа: " + num4 +", " + num5);

        System.out.print("Одинаковые в них цифры: ");
        if (num4Hundred == num5Hundred) {
            System.out.print(num4Hundred + " ");
        }
        if (num4Ten == num5Ten) {
            System.out.print(num4Ten + " ");
        }
        if (num4Unit == num5Unit) {
            System.out.print(num4Unit);
        }
        if (num4Hundred != num5Hundred & num4Ten != num5Ten & num4Unit != num5Unit) {
            System.out.print(" отсутствуют");
        }

        System.out.print("\nНомера разрядов: ");
        if (num4Hundred == num5Hundred) {
            System.out.print("3ий ");
        }
        if (num4Ten == num5Ten) {
            System.out.print("2ой ");
        }
        if (num4Unit == num5Unit) {
            System.out.print("1ый");
        }
        if (num4Hundred != num5Hundred & num4Ten != num5Ten & num4Unit != num5Unit) {
            System.out.print(" отсутствуют");
        }

        System.out.println("\n\n5. Определение символа по его коду\n");

        char symbol = '\u0057';

        if (symbol >= '\u0061' && symbol <= '\u0080') {
            System.out.println(symbol + " - это маленькая буква");
        } else if (symbol >= '\u0041' && symbol <= '\u0060') {
            System.out.println(symbol + " - это большая буква");
        } else if (symbol >= '\u0030' && symbol <= '\u0039') {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + "- это не буква и не число");
        }

        System.out.println("\n6.  Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 300000;
        System.out.println("Сумма вклада = " + deposit);

        if (deposit < 100000) {
            System.out.println("Начисленный процент = " + (deposit / 100 * 5));
            System.out.println("Итоговая сумма с процентами = " + (deposit / 100 * 5 + deposit));
        } else if (deposit >= 100000 & deposit <= 300000) {
            System.out.println("Начисленный процент = " + (deposit / 100 * 7));
            System.out.println("Итоговая сумма с процентами = " + (deposit / 100 * 7 + deposit));
        } else if (deposit > 300000) {
            System.out.println("Начисленный процент = " + (deposit / 100 * 10));
            System.out.println("Итоговая сумма с процентами = " + (deposit / 100 * 10 + deposit));
        }

        System.out.println("\n7.  Определение оценки по предметам\n");

        int historyProcent = 59;
        int programmingProcent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if (historyProcent <= 60) {
            historyGrade = 2;
        } else if (historyProcent > 60 & historyProcent < 73) {
            historyGrade = 3;
        } else if (historyProcent >= 73 & historyProcent < 91) {
            historyGrade = 4;
        } else if (historyProcent >= 91) {
            historyGrade = 5;
        }

        if (programmingProcent <= 60) {
            programmingGrade = 2;
        } else if (programmingProcent > 60 & programmingProcent < 73) {
            programmingGrade = 3;
        } else if (programmingProcent >= 73 & programmingProcent < 91){
            programmingGrade = 4;
        } else if (programmingProcent >= 91) {
            programmingGrade = 5;
        }

        System.out.println(historyGrade + " история");
        System.out.println(programmingGrade + " програмирование");
        System.out.println("Средний балл по предметам = " + (historyGrade + programmingGrade) / 2);
        System.out.println("Средний процент по предметам = " + (historyProcent + programmingProcent) / 2);

        System.out.println("\n8.  Расчет прибыли за год\n");

        int rent = 5000;
        int income = 13000;
        int costPrice = 9000;
        int profit = income - rent - costPrice;

        if (profit > 0) {
            System.out.println("+" + profit);
        } else {
            System.out.println(profit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");

        int money = 567;

        int hundredHave = 10;
        int tenHave = 5;
        int unitHave = 50;

        int hundredNeed = 0;
        int tenNeed = 0;
        int unitNeed = 0;

        int hundredCount = 0;
        int tenCount = 0;
        int unitCount = 0;

        boolean isEnoughtMoney = money < (hundredHave * 100 + tenHave * 10 + unitHave);
        boolean isEqualMoney = money == (hundredHave * 100 + tenHave * 10 + unitHave);

        if (!isEnoughtMoney & !isEqualMoney) {
            System.out.println("Извините, у нас не хватает купюр");
        }

        if (money / 100 > hundredHave & isEnoughtMoney & !isEqualMoney) {
            hundredNeed = (money / 100 * hundredHave) / 100;
            tenNeed = hundredNeed * 10;
            tenHave -= tenNeed;
            hundredCount = hundredHave;
            hundredHave = 0;
            System.out.println("Количество сотен: " + hundredCount);
        } else if (money / 100 <= hundredHave & isEnoughtMoney & !isEqualMoney) {
            hundredNeed = money / 100;
            money -= 100 * hundredNeed;
            hundredHave -= hundredNeed;
            hundredCount += hundredNeed;
            System.out.println("Количество сотен: " + hundredCount);
        }

        if (money / 10 > tenHave & isEnoughtMoney & !isEqualMoney) {
            money -= tenHave * 10;
            tenCount += tenHave;
            tenNeed = money / 10;
            unitNeed = tenNeed * 10 +  money - (tenNeed * 10);
            unitCount += unitNeed;
            money -= unitNeed;
            unitHave -= unitNeed;
            System.out.println("Количество десятков: " + tenCount);
            System.out.println("Количество единиц: " + unitCount);
        } else if (money / 10 <= tenHave & isEnoughtMoney & !isEqualMoney) {
            tenNeed = money / 10; 
            money -= 10 * tenNeed;
            tenHave -= tenNeed;
            tenCount += tenNeed;
            unitCount = money;
            unitHave -= money;
            money = 0;
            System.out.println("Количество десятков: " + tenCount);
            System.out.println("Количество единиц: " + unitCount);
        }

        if(isEnoughtMoney & !isEqualMoney) {
            System.out.println("Выдаваемая сумма = " + (hundredCount * 100 + tenCount * 10 + unitCount));
        }

        if(isEqualMoney) {
            money = 0;
            hundredCount = hundredHave;
            tenCount = tenHave;
            unitCount = unitHave;
            System.out.println("Количество сотен: " + hundredCount);
            System.out.println("Количество десятков: " + tenCount);
            System.out.println("Количество единиц: " + unitCount);
            System.out.println("Выдаваемая сумма = " + (hundredCount * 100 + tenCount * 10 + unitCount));
        }
    }
}