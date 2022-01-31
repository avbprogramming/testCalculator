/*
Шестнадцатеричный конвертер
Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра,
из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление.
Метод работает только с положительными числами и не пустыми строками.
Если входящий параметр меньше или равен 0, метод toHex(int) возвращает предупреждение.

Алгоритм перевода шестнадцатеричного числа в десятичное следующий:
for (int i = 0; i < длина входящей строки; i++) {
десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
}
  private static final String HEX = "0123456789abcdef";
    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));

 */

public class hexToDecimal {
    // public static String toDecimal (String hexNum) {
    public static String toDecimal(String hexNumber) {
        if (!check.checkEmptyString(hexNumber)) {
            return "Пустая строка";
        }
        if (!check.checkHex(hexNumber)) {
            return "В строке есть неверные символы";
        }
        int toDecimalNum = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char j = hexNumber.charAt(i);
            int n = decimalToHex.HEX.indexOf(j);
            toDecimalNum = (16 * toDecimalNum + (n));
        }
        return String.valueOf(toDecimalNum);
    }
}




