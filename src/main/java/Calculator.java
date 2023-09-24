
public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculateDiscount(20, 12));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+' -> result = firstOperand + secondOperand;
            case '-' -> result = firstOperand - secondOperand;
            case '*' -> result = firstOperand * secondOperand;
            case '/' -> {
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            }
            default -> throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculateDiscount(double sumProduct, int discount) {
        double result;

        if (discount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше 0%");
        } else if (discount > 90) {
            throw new ArithmeticException("Скидка не может быть больше 90%");
        } else if (sumProduct < 0) {
            throw new ArithmeticException("Сумма покупки не может быть меньше 0%");
        } else {
            double sumDiscount = sumProduct * discount / 100;
            result = sumProduct - sumDiscount;
        }

        return result;
    }

}