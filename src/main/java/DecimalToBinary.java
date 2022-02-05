/*
 Двоичный конвертер
Метод toBinary(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его
строковое представление.
Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку.

Алгоритм перевода десятичного числа в представление двоичного числа следующий:
while(десятичное число не равно 0) {
двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
десятичное число = десятичное число / 2
}
Requirements:

1. Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
2. Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
3. Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
4. Объект типа BigInteger использовать нельзя.
5. Объект типа BigDecimal использовать нельзя.
 */

public class DecimalToBinary {
    /*
        public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
    }
*/
    public static String toBinary(String firstNum) {
        if (!Check.checkEmptyString(firstNum)){
            return "Пустая строка";
        }
        if (!Check.checkDecimal(firstNum)){
            return "В строке есть неверные символы";
        }
        int decimalNumber = Integer.parseInt(firstNum);

        int biNum;
        String tempBi = "";
        while (decimalNumber != 0) {
            biNum = (decimalNumber % 2);
            tempBi = biNum + tempBi;
            decimalNumber = decimalNumber / 2;
        }
        return tempBi;
    }
}
