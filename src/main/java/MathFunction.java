public class MathFunction {
    public static void plus(String firstNum, String secondNum) {
        if (!Check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (Check.checkDecimalMath(firstNum, secondNum) == false) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                System.out.println("Ответ: " + (num1 + num2));

            }
        }
    }

    public static void minus(String firstNum, String secondNum) {
        if (!Check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (!Check.checkDecimalMath(firstNum, secondNum)) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                System.out.println("Ответ: " + (num1 - num2));

            }
        }
    }

    public static void multiply(String firstNum, String secondNum) {
        if (!Check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

        }
        if (!Check.checkDecimalMath(firstNum, secondNum)) {
            System.out.println("Введённые данные не верны");
        } else {
            int num1 = Integer.parseInt(firstNum);
            int num2 = Integer.parseInt(secondNum);
            System.out.println("Ответ: " + (num1 * num2));

        }
    }


    public static void divide(String firstNum, String secondNum) {
        if (!Check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (!Check.checkDecimalMath(firstNum, secondNum) && (!secondNum.equals('0'))) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = num1 / num2;
                System.out.println("Ответ: " + answer);

            }
        }
    }
}
