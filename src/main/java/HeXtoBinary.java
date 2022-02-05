public class HeXtoBinary {

/*
Двоично-шестнадцатеричный конвертер
Публичный статический метод toBinary(String) — переводит из строкового
представления шестнадцатеричного числа в строковое представление двоичного числа.

Метод работает только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.

Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
Например:
    шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
    двоичное представление — "100111010000".


   public static void main(String[] args) {
        String binaryNumber = "100111010000";
        // String binaryNumber = "10010";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        //String hexNumber = "9z0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }
*/


    public static String toBinary(String hexNumber) {

        String answer = "";
        char[] hexNumberChar = hexNumber.toCharArray();
        if (!Check.checkEmptyString(hexNumber)) {
            return "Пустая строка";
        }
        if (!Check.checkHex(hexNumber)){
            return "Введены не верные данные";
        }

       // собираю строку
        for (int i = 0; i < hexNumberChar.length; i++) {
            if (hexNumberChar[i] == '0') {
                answer = answer + "0000";
            }
            if (hexNumberChar[i] == '1') {
                answer = answer + "0001";
            }
            if (hexNumberChar[i] == '2') {
                answer = answer + "0010";
            }
            if (hexNumberChar[i] == '3') {
                answer = answer + "0011";
            }
            if (hexNumberChar[i] == '4') {
                answer = answer + "0100";
            }
            if (hexNumberChar[i] == '5') {
                answer = answer + "0101";
            }
            if (hexNumberChar[i] == '6') {
                answer = answer + "0110";
            }
            if (hexNumberChar[i] == '7') {
                answer = answer + "0111";
            }
            if (hexNumberChar[i] == '8') {
                answer = answer + "1000";
            }
            if (hexNumberChar[i] == '9') {
                answer = answer + "1001";
            }
            if (hexNumberChar[i] == 'a') {
                answer = answer + "1010";
            }
            if (hexNumberChar[i] == 'b') {
                answer = answer + "1011";
            }
            if (hexNumberChar[i] == 'c') {
                answer = answer + "1100";
            }
            if (hexNumberChar[i] == 'd') {
                answer = answer + "1101";
            }
            if (hexNumberChar[i] == 'e') {
                answer = answer + "1110";
            }
            if (hexNumberChar[i] == 'f') {
                answer = answer + "1111";
            }
        }
        return answer;
    }
}
