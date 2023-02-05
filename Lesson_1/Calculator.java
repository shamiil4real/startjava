public class Calculator {

    public static void main(String[] args) {
        int num1 = 11; long copyNum1 = num1;
        char sign = '^';
        int num2 = 3;
        long result = 0;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            for (int i = 1; i < num2; i++) {
                copyNum1 *= num1;
            }
            result = copyNum1;
        } else if (sign == '%') {
            result = num1 % num2;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}