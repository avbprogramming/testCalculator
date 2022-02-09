public class Choice {

    public static void choice(int choice, String firstNum, String secondNum) {

        switch (choice) {
            case (1) -> MathFunction.plus(firstNum, secondNum);
            case (2) -> MathFunction.minus(firstNum, secondNum);
            case (3) -> MathFunction.multiply(firstNum, secondNum);
            case (4) -> MathFunction.divide(firstNum, secondNum);
            default -> System.out.println("Выбор не верный.");
        }
    }

    public static String choice2(int choice, String firstNum) {
        String answer = "";
        switch (choice) {
            case (5):
                answer = BinaryToDecimal.toDecimal(firstNum);
                break;
            case (6):
                answer = DecimalToBinary.toBinary(firstNum);
                break;
            case (7):
                answer = BinaryToHex.toHex(firstNum);
                break;
            case (8):
                answer = HeXtoBinary.toBinary(firstNum);
                break;
            case (9):
                answer = OctalToDecimal.toOctal(firstNum);
                break;
            case (10):
                answer = DecimalToOctal.toDecimal(firstNum);
                break;
            case (11):
                answer = DecimalToHex.toHex(firstNum);
                break;
            case (12):
                answer = HexToDecimal.toDecimal(firstNum);
                break;
            case (13):
                break;
            default: {
                System.out.println("Выбор не верный. ");
            }
        }
        return answer;
    }
}

