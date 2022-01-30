/*
Двоично-шестнадцатеричный конвертер
Статический метод toHex(String) должен переводить строковое представление двоичного числа,
полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать
его строковое представление.
Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:
    Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
    Если это не так, то добавляем нужное количество 0 в начало строки.
    Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Например:
    двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
    шестнадцатеричное представление — "9d0".

    Метод работает только с не пустыми строками.
    Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
    Если входящий параметр метода содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.

 */

public class binaryToHex {
    /*
    public static void main(String[] args) {
       // String binaryNumber = "100111010000";
         String binaryNumber = "10010";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
    }
     */
    public static String toHex(String binaryNumber) {
        if (!check.checkEmptyString(binaryNumber)){
            return "Пустая строка";
        }
        // проверка входной строки на содердание только 0 и 1
        if (!check.checkBinary(binaryNumber)){
            return "В строке есть неверные символы";
        }
        // перевод входной строки в массив симоволов
        char[] numInChar = binaryNumber.toCharArray();
        int block = 4;
        // создание массива для доведния общей длины массивы кратности 4, согласно рекомендации
        char[] numInCharAdd = new char[numInChar.length];
        // Проверяю длину строки, полученной входящим параметром. Она должна быть кратна 4.
        int checkLengthOfString = (numInChar.length % block);
        // если это правда, то перезаписываем массив способом ниже
        if (checkLengthOfString == 0) {
            System.arraycopy(numInChar, 0, numInCharAdd, 0, numInChar.length);
        }
        // если длина массива не кратна 4, то копируем входящий массив во вновь созданный предварительно доведя длину массива до кратности 4;
        if ((numInChar.length % block) != 0) {
            checkLengthOfString = (block - numInChar.length % block);
            numInCharAdd = new char[numInChar.length + checkLengthOfString];
            for (int j = 0; j < checkLengthOfString; j++) {
                numInCharAdd[j] = '0';
            }
            System.arraycopy(numInChar, 0, numInCharAdd, checkLengthOfString, numInChar.length);
        }
        //  System.arraycopy(numInChar, 0, numInCharAdd, checkLengthOfString, numInChar.length);
        // System.arraycopy(откуда \ с какой позиции \ куда \ начиная с какой позиции \ кол-во элементов);

        // выясняю необходимое кол-во блоков
        int blocksOfHex = (numInCharAdd.length / block);
        int count = 0;
        // создаю двумерный массив для записи блоков
        char[][] numHexChar = new char[blocksOfHex][block];
        if (count < blocksOfHex) {
            for (int i = 0; i < blocksOfHex; i++) {
                for (int j = 0; j < block; j++) {
                    //2d [кол-во блоков] [значения в блоках] = одномерный массив [значение в 1d + блок(4)*итераций]
                    numHexChar[count][j] = numInCharAdd[j + count * block];
                }
                count++;
            }
        }
        //перевожу из 2d в 1d
        String answer = "";
        String[] temp = new String[blocksOfHex];
        for (int i = 0; i < blocksOfHex; i++) {
            temp[i] = String.valueOf(numHexChar[i]);
        }

        // собираю строку
        for (int i = 0; i < temp.length; i++) {
            if (temp[0].equals("0000")) {
                answer = answer + "";
            }
            if (temp[i].equals("0000")) {
                answer = (answer + "0");
            } else if (temp[i].equals("0001")) {
                answer = answer + "1";
            } else if (temp[i].equals("0010")) {
                answer = answer + "2";
            } else if (temp[i].equals("0011")) {
                answer = answer + "3";
            } else if (temp[i].equals("0100")) {
                answer = answer + "4";
            } else if (temp[i].equals("0101")) {
                answer = answer + "5";
            } else if (temp[i].equals("0110")) {
                answer = answer + "6";
            } else if (temp[i].equals("0111")) {
                answer = answer + "7";
            } else if (temp[i].equals("1000")) {
                answer = answer + "8";
            } else if (temp[i].equals("1001")) {
                answer = answer + "9";
            } else if (temp[i].equals("1010")) {
                answer = answer + "a";
            } else if (temp[i].equals("1011")) {
                answer = answer + "b";
            } else if (temp[i].equals("1100")) {
                answer = answer + "c";
            } else if (temp[i].equals("1101")) {
                answer = answer + "d";
            } else if (temp[i].equals("1110")) {
                answer = answer + "e";
            } else if (temp[i].equals("1111")) {
                answer = answer + "f";
            }
        }
        return answer;
    }


}
