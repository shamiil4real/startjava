public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");

        byte displaySize = 16;
        short brightness = 300;
        int storage = 512;
        long price = 200000;
        float height = 18.4f;
        double width = 356.7d;
        char model = 'D';
        boolean gaming = false;
        System.out.println("Диагональ экрана: " + displaySize + " дюймов");
        System.out.println("Максимальная яркость: " + brightness + " дюймов");
        System.out.println("Встроенная память: " + storage + " гб");
        System.out.println("Цена: " + price + " р");
        System.out.println("Высота: " + height + " мм");
        System.out.println("Серия модели: " + model + " мм");
        System.out.println("Игровой: " + gaming);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        int discountSum = (penPrice + bookPrice) / discountPercent;
        System.out.println("Сумма скидки = " + discountSum);
        System.out.println("Общая стоимость товара со скидкой = " + (penPrice + bookPrice - discountSum));

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println(byteMax + "\n" +
                ++byteMax + "\n" +
                --byteMax);
        System.out.println("\n" + shortMax + "\n" +
                ++shortMax + "\n" +
                --shortMax);
        System.out.println("\n" + intMax + "\n" +
                ++intMax + "\n" +
                --intMax);
        System.out.println("\n" + longMax + "\n" +
                ++longMax + "\n" +
                --longMax);

        System.out.println("\n5. Перестановка значений переменных\n");

        System.out.println("С помощью третьей переменной:");
        int digital1 = 2;
        int digital2 = 5;
        System.out.println("Исходные значения переменных: " + digital1 + ", " + digital2);
        int digital3 = digital1;
        digital1 = digital2;
        digital2 = digital3;
        System.out.println("Новые значения переменных: " + digital1 + ", " + digital2);

        System.out.println("\nС помощью побитовой операции: ");
        System.out.println("Исходные значения переменных: " + digital1 + ", " + digital2);
        digital1 = digital1 ^ digital2;
        digital2 = digital1 ^ digital2;
        digital1 = digital1 ^ digital2;
        System.out.println("Новые значения переменных: " + digital1 + ", " + digital2);

        System.out.println("\nС помощью арифмитических операций: ");
        System.out.println("Исходные значения переменных: " + digital1 + ", " + digital2);
        digital1 = digital1 + digital2;
        digital2 = digital1 - digital2;
        digital1 = digital1 - digital2;
        System.out.println("Новые значения переменных: " + digital1 + ", " + digital2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) hash + " " + hash);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) at + " " + at);
        System.out.println((int) caret + " " + caret);
        System.out.println((int) underscore + " " + underscore);

        System.out.println("\n7. Вывод в консоль\n");

        char slash = '/';
        char bSlash = '\\';
        char openP = '(';
        char closeP = ')';
        System.out.println("    " + slash + "" + bSlash);
        System.out.println("   " + slash + "  " + bSlash);
        System.out.println("  " + slash + underscore + "" + openP + " " + closeP + "" + bSlash);
        System.out.println(" " + slash + "      " + bSlash);
        System.out.println(slash + "" + underscore + underscore + underscore + underscore + "" + slash + "" + "" + bSlash + "" + underscore + underscore + "" + bSlash);

        System.out.println("\n8. Вывод количества сотен, десятков, единиц\n");

        int num = 123;
        int hundred = num / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;
        int sum = hundred + ten + one;
        int product = hundred * ten * one;
        System.out.println("Числов 123 содержит: ");
        System.out.println(hundred + " сотен");
        System.out.println(ten + " десятков");
        System.out.println(one + " единиц");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение его цифр = " + product);

        System.out.println("\n9. Вывод времени\n");

        int time = 886399;
        int hours = time / 3600;
        int minuts = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minuts + ":" + seconds);
    }
}