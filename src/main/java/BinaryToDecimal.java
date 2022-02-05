
/*
 Двоичный конвертер
Публичный статический метод toDecimal(String) — из строкового представления
двоичного числа переводит в десятичное число.
Метод работает только с положительными числами и не пустыми строками.
Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.

Алгоритм перевода представления двоичного числа в десятичное число следующий:
for (int i = 0; i < длины двоичного представления; i++) {
десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
}

Изначально берется крайнее правое число из двоичного представления. С каждой итерацией цикла берется следующее число ближе к началу двоичного представления.

Requirements:

1. Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
2. Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
3. Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
4. Объект типа BigInteger использовать нельзя.
5. Объект типа BigDecimal использовать нельзя.
 */
public class BinaryToDecimal {
    /*
        public static void main(String[] args) {
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }
*/
    public static String toDecimal(String binaryNumber) {
        if (!Check.checkEmptyString(binaryNumber)) {
            return "Пустая строка";
        }
        if (!Check.checkBinary(binaryNumber)) {
            return "Введены не верные данные";
        }
        int decimalNum = 0;

        char[] binaryNumberChar = binaryNumber.toCharArray();
        int dlinaChar = binaryNumberChar.length;
        for (int i = 0; i < dlinaChar - 1; i++) {
            if (binaryNumberChar[i] == '1') {
                decimalNum = (int) (decimalNum + Math.pow(2, (dlinaChar - i - 1)));

            } else {
                decimalNum = (int) (decimalNum + Math.pow(0, i));
            }
        }
        if (binaryNumberChar[binaryNumberChar.length - 1] == '1') {
            decimalNum += 1;
        }

        return String.valueOf(decimalNum);
    }
}

