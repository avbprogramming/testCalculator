public class choice {
    public static void choice(int choice, String firstNum, String secondNum) {
        switch (choice) {
            case (1):
                mathFunction.plus(firstNum, secondNum);
                break;
            case (2):
                mathFunction.minus(firstNum, secondNum);
                break;
            case (3):
                mathFunction.multiply(firstNum, secondNum);
                break;
            case (4):
                mathFunction.divide(firstNum, secondNum);
                break;
            default:
                System.out.println("Выбор не верный. ");
        }
    }

    public static String choice2(int choice, String firstNum) {
        String answer = "";
        switch (choice) {
            case (5):
                answer = binaryToDecimal.toDecimal(firstNum);
                break;
            case (6):
                answer = decimalToBinary.toBinary(firstNum);
                break;
            case (7):
                answer = binaryToHex.toHex(firstNum);
                break;
            case (8):
                answer = heXtoBinary.toBinary(firstNum);
                break;
            case (9):
                 answer = octalToDecimal.toOctal(firstNum);
                break;
            case (10):
                 answer = decimalToOctal.toDecimal(firstNum);
                break;
            case (11):
                 answer = binaryToHex.toHex(firstNum);
                break;
            case (12):
                 answer = binaryToHex.toHex(firstNum);
                break;
            default:
                System.out.println("Выбор не верный. ");
        }
        return answer;
    }
}

