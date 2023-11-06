import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание #3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное:");
        System.out.println("1.Кошка:");
        System.out.println("2.Голубь:");
        System.out.println("3.Лягушка:");
        System.out.println("4.Ворона:");
        System.out.println("5.Корова:");
        System.out.println("6.Ишак:");
        System.out.println("7.Лев:");
        System.out.println("8.Волк:");
        System.out.println("9.Мышь:");
        System.out.println("10.Лошадь:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гуль");
                break;
            case 3:
                System.out.println("Ква");
                break;
            case 4:
                System.out.println("Кар");
                break;
            case 5:
                System.out.println("Му");
                break;
            case 6:
                System.out.println("Иа");
                break;
            case 7:
                System.out.println("Ар");
                break;
            case 8:
                System.out.println("Ауф");
                break;
            case 9:
                System.out.println("Пи");
                break;
            case 10:
                System.out.println("Игого");
                break;
            default:
                System.out.println("Введите существующее животное");
        }
    }
}
