public class Calculator {

    private int numder1;
    private int number2;
    private char mathOperatore;
    private long result;

    public void setNumber1(int numder1) {
        this.numder1 = numder1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathOperatore(char mathOperatore) {
        this.mathOperatore = mathOperatore;
    }

    public void calculate() {
        result = 1;

        switch(mathOperatore) {
            case '+' :
                result = numder1 + number2;
                break;
            case '-' :
                result = numder1 - number2;
                break;
            case '*' :
                result = numder1 * number2;
                break;
            case '/' :
                result = numder1 / number2;
                break;
            case '^' :
                for (int i = 0; i < number2; i++) {
                    result *= numder1;
                }
                break;
            case '%' :
                result = numder1 % number2;
                break;
            default :
                result = 0;
                System.out.println("Вы указали некорректный математический символ");
        }

        System.out.println(numder1 + " " + mathOperatore + " " + number2 + " = " + result);
    }
}