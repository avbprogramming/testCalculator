/*
8-10
Восьмеричный конвертер
Публичный статический метод toDecimal(int) — из восьмеричной в десятичную.
Метод работает только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.

Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}
        public static void main(String[] args) {
            int decimalNumber = 21;
            System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
            int octalNumber = 25;
            System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        }
*/

public class octalToDecimal {
    public static String toOctal(String firstNum) {
        if (!check.checkEmptyString(firstNum)){
            return "Пустая строка";
        }
        if(!check.checkOctal(firstNum)){
            return "Введены не верные данные";
        }
        int decimalNumber =  Integer.parseInt(firstNum);
        int i = 0;
        int octalNum = 0;
        while (decimalNumber != 0) {
            octalNum = (int) (octalNum + (decimalNumber % 8) * Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return String.valueOf(octalNum);
    }
}


