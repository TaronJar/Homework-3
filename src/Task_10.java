import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Задание #10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int number = scanner.nextInt();
        var podbezd = (number + 35) / 36;
        number -= (podbezd - 1) * 36;
        var etag = (number + 3) / 4;
        System.out.println("Подъезд: " + podbezd);
        System.out.println("Этаж: " + etag);
    }
}
