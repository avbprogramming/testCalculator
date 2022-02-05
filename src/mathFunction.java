public class mathFunction {
    public static void plus(String firstNum, String secondNum) {
        if (!check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (check.checkDecimalMath(firstNum, secondNum) == false) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = num1 + num2;
                System.out.println(answer);
            }
        }
    }

    public static void minus(String firstNum, String secondNum) {
        if (!check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (!check.checkDecimalMath(firstNum, secondNum)) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = num1 - num2;
                System.out.println(answer);
            }
        }
    }

    public static void multiply(String firstNum, String secondNum) {
            if (!check.checkEmptyString(firstNum, secondNum)) {
                System.out.println("Введена пустая строка(и)");

            } else {

            }
            if (!check.checkDecimalMath(firstNum, secondNum)) {
                System.out.println("Введённые данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = num1 * num2;
                System.out.println(answer);
            }
        }


    public static void divide(String firstNum, String secondNum) {
        if (!check.checkEmptyString(firstNum, secondNum)) {
            System.out.println("Введена пустая строка(и)");

        } else {

            if (!secondNum.equals('0') || !check.checkDecimalMath(firstNum, secondNum)) {
                System.out.println("Введенные данные не верны");
            } else {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = num1 / num2;
                System.out.println(answer);
            }
        }
    }
}
