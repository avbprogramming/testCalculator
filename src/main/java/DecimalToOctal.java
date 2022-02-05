/*
8-10
Восьмеричный конвертер
Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве
входящего параметра, из десятичной системы счисления в восьмеричную.

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}
 */
public class DecimalToOctal {

    public static String toDecimal(String octalNum) {
        if (!Check.checkEmptyString(octalNum)){
            return "Пустая строка";
        }
        if(!Check.checkOctal(octalNum)){
            return "Введены не верные данные";
        }
        int octalNumber =  Integer.parseInt(octalNum);
        int decimalNum = 0;
        int i = 0;
        while (octalNumber != 0) {
            decimalNum = (int) (decimalNum + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return String.valueOf(decimalNum);
    }
}

