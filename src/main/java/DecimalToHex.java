
/*
Шестнадцатеричный конвертер
Публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.

Метод работает только с положительными числами и не пустыми строками.
Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.

Один из алгоритмов перевода десятичного числа в шестнадцатеричное следующий:
while(десятичное число не равно 0) {
представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
+ представление шестнадцатеричного числа
десятичное число = десятичное число / 16
}

Метод main() не принимает участие в тестировании.

    private static final String HEX = "0123456789abcdef";
    public static void main(String[] args) {
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

 */
public class DecimalToHex {
    final static String HEX = "0123456789abcdef";
    public static String toHex(String firstNum) {
        String hexNum = "";
        if (!Check.checkEmptyString(firstNum)) {
            return "Пустая строка";
        }
    if (!Check.checkDecimal(firstNum)){
        return "Введены не верные данные";
        }

         int decimalNumber = Integer.parseInt(firstNum);
            while (decimalNumber != 0) {
                //    System.out.println(HEX.charAt(decimalNumber % 16));
                hexNum = (HEX.charAt(decimalNumber % 16) + hexNum);
                decimalNumber = decimalNumber / 16;
            }

        return hexNum;
    }
}



