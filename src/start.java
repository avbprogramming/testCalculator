import java.util.InputMismatchException;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        menu.menu();
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            if (num <= 4) {
                System.out.print("Введите первое число: ");
                sc.nextLine();
                String firstNum = sc.nextLine();
                System.out.print("Введите второе число: ");
                String secondNum = sc.nextLine();
                choice.choice(num, firstNum, secondNum);
            } else if (num == 13) {
                System.out.println("Всего наилучшего");
            } else {
                System.out.print("Введите число: ");
                sc.nextLine();
                String firstNum = sc.nextLine();
                System.out.println(choice.choice2(num, firstNum));
            }
        } catch (InputMismatchException e) {
            System.out.println("Введенные данные не верны. Диапазон выбора от 1 до 13.");
        }

    }
}
