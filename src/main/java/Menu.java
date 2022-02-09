import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menu() {

        System.out.println("Список доступных операций: ");
        System.out.println("1 ---> Сложение.");
        System.out.println("2 ---> Вычитание.");
        System.out.println("3 ---> Умножение.");
        System.out.println("4 ---> Деление.");
        System.out.println("5 ---> из 2-ой в 10-ую СИ.");
        System.out.println("6 ---> из 10-ой в 2-ую СИ.");
        System.out.println("7 ---> из 2-ой в 16-ую СИ.");
        System.out.println("8 ---> из 16-ой в 2-ую СИ.");
        System.out.println("9 ---> из 10-ой в 8-ую СИ.");
        System.out.println("10 ---> из 8-ой в 10-ую СИ.");
        System.out.println("11 ---> из 10-ой в 16-ую СИ.");
        System.out.println("12 ---> из 16-ой в 10-ую СИ.");
        System.out.println("13 ---> Выход.");
        System.out.print("Какую операцию над числами вы хотели бы провести? ");
    }

    public static int begin() {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            num = sc.nextInt();
            if (num < 1 || num > 14) {
                System.out.print("Не верный выбор.");
                menu();
                begin();
            }
           else  if (num < 5) {
                System.out.print("Введите первое число: ");
                sc.nextLine();
                String firstNum = sc.nextLine();
                System.out.print("Введите второе число: ");
                String secondNum = sc.nextLine();
                Choice.choice(num, firstNum, secondNum);
                menu();
            }

            else if (num > 4 && num < 13) {
                System.out.print("Введите число: ");
                sc.nextLine();
                String firstNum = sc.nextLine();
                System.out.println(Choice.choice2(num, firstNum));
                menu();
            }
           else  if (num == 13) {
                System.out.println("Всего наилучшего");
            }
             else {
                begin();
            }
        } catch (InputMismatchException e) {
            System.out.print("Введенные данные не верны. Диапазон выбора от 1 до 13.");
            Menu.menu();
            begin();
        }
        return num;
    }

}
