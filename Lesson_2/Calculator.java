public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char mathOperatore;
    private long result;
    private String answer;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperatore(char mathOperatore) {
        this.mathOperatore = mathOperatore;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void calculate() {
        result = 1;

        switch(mathOperatore) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            case '^' :
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            default :
                result = 0;
                System.out.println("Укажите знак");
                break;
        }

        System.out.println(firstNumber + " " + mathOperatore + " " + secondNumber + " = " + result);
    }
}