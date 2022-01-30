import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать. ");
        System.out.println("Данная программа - может выполнять некоторые математические вычисления с двумя числами. Больше или равно 0.");
        System.out.println("Список доступных операций: ");
        System.out.println("1 ---> Сложение.");
        System.out.println("2 ---> Вычитание.");
        System.out.println("3 ---> Умножение.");
        System.out.println("4 ---> Деление.");
        System.out.println("5 ---> Перевод из 2-ой в 10-ую систему исчисления.");
        System.out.println("6 ---> Перевод из 10-ой в 2-ую систему исчисления.");
        System.out.println("7 ---> Перевод из 2-ой в 16-ую систему исчисления.");
        System.out.println("8 ---> Перевод из 16-ой в 2-ую систему исчисления.");
        System.out.println("9 ---> Перевод из 8-ой в 10-ую систему исчисления.");
        System.out.println("10 ---> Перевод из 10-ой в 8-ую систему исчисления.");
        System.out.println("11 ---> Перевод из 16-ой в 10-ую систему исчисления.");
        System.out.println("12 ---> Перевод из 10-ой в 16-ую систему исчисления.");
        System.out.print("Какую операцию над числами вы хотели бы провести? ");
        int num = sc.nextInt();
        if (num <= 4) {
            System.out.print("Введите первое число: ");
            sc.nextLine();
            String firstNum = sc.nextLine();
            System.out.print("Введите второе число: ");
            String secondNum = sc.nextLine();
            choice.choice(num, firstNum, secondNum);
        }
        System.out.print("Введите число: ");
        sc.nextLine();
        String firstNum = sc.nextLine();
        System.out.println(choice.choice2(num, firstNum));
    }

}
