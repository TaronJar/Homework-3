import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x: ");
        double x = sc.nextDouble();
        System.out.println("Введите координату y: ");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в 4 четверти");
        }
        System.out.println();
    }
}
