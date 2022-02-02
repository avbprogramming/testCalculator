
public class check {

    /*
    public static boolean checkTwoEmptyStrings(String firstNum, String secondNum) {
        if (firstNum == null || secondNum == null) {
            return false;
        }
        return true;
    }

     */

    public static boolean checkEmptyString(String firstNum) {
        if (firstNum == null || firstNum.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean checkBinary(String firstNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        for (int i = 0; i < firstNumCharArray.length; i++) {
            char num = firstNumCharArray[i];
            if (num != '0' && num != '1') {
                return false;
            }
        }
        return true;
    }

/*
    public static boolean checkOctal(String firstNum, String secondNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        for (int i = 0; i < firstNumCharArray.length; i++) {
            char num = firstNumCharArray[i];
            if (num != '0' && num != '1' && num != '2' && num != '3' && num != '4' && num != '5' && num != '6' && num != '7') {
                return false;
            }
        }
        return true;
    }

 */
    public static boolean checkOctal(String firstNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        for (int i = 0; i < firstNumCharArray.length; i++) {
            char num = firstNumCharArray[i];
            if (num != '0' && num != '1' && num != '2' && num != '3' && num != '4' && num != '5' && num != '6' && num != '7') {
                return false;
            }
        }
        return true;
    }


    public static boolean checkDecimal(String firstNum, String secondNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        for (int i = 0; i < firstNumCharArray.length; i++) {
            char num = firstNumCharArray[i];
            if (num != '0' && num != '1' && num != '2' && num != '3' && num != '4' && num != '5' && num != '6' && num != '7' && num != '8' && num != '9') {
                return false;
            }
        }


        char[] secondNumCharArray = secondNum.toCharArray();
        for (int i = 0; i < secondNumCharArray.length; i++) {
            char num = secondNumCharArray[i];
            if (num != '0' && num != '1' && num != '2' && num != '3' && num != '4' && num != '5' && num != '6' && num != '7' && num != '8' && num != '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDecimal(String firstNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        for (int i = 0; i < firstNumCharArray.length; i++) {
            char num = firstNumCharArray[i];
            if (num != '0' && num != '1' && num != '2' && num != '3' && num != '4' && num != '5' && num != '6' && num != '7' && num != '8' && num != '9') {
                return false;
            }
        } return true;
    }



        public static boolean checkHex(String firstNum) {
        char[] firstNumCharArray = firstNum.toCharArray();
        String HEX = "0123456789abcdef";
        char[] HEXString = HEX.toCharArray();
        char[] firstNumArray = firstNum.toCharArray();
        int count = 0;
        // Сравниваю 2 массива, чтобы понять сколько совпадений символов получится, если совпадений меньше, чем кол-во символов в приходящей строке, то в приходящей строке есть чужие символы
        for (int i = 0; i < firstNumCharArray.length; i++) {
            for (int j = 0; j < HEXString.length; j++) {
                if (firstNumArray[i] == HEXString[j]) {
                    count++;
                }
            }
        }
        if (count != firstNumCharArray.length) {
            return false;
        }
        return true;
    }
}
