import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Задание #5");
        String[] nazv = {"Крыса", "Корова", "Бык", "Тигр",
                "Дракон", "Змея","Лошадь", "Овца", "Обезьяна",
                "Петух", "Собака", "Свинья"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, месяц, год (например: 5/12/1974)");
        int day = sc.nextInt();
        int mouth = sc.nextInt();
        int year = sc.nextInt();
        String zodiacGod = nazv[(year - 4) % 12];

        String zodiacZnak = "";
        switch (mouth) {
            case 1:
                if (day < 20) {
                    zodiacZnak = "Козерог";
                } else {
                    zodiacZnak = "Водолей";
                }
                break;
            case 2:
                if (day < 19 ) {
                    zodiacZnak = "Водолей";
                } else {
                    zodiacZnak = "Рыбы";
                }
                break;
            case 3:
                if (day < 21) {
                    zodiacZnak = "Рыбы";
                } else {
                    zodiacZnak = "Овен";
                }
                break;
            case 4:
                if (day < 21) {
                    zodiacZnak = "Овен";
                } else {
                    zodiacZnak = "Телец";
                }
                break;
            case 5:
                if (day < 21) {
                    zodiacZnak = "Телец";
                } else {
                    zodiacZnak = "Близнецы";
                }
                break;
            case 6:
                if (day < 22) {
                    zodiacZnak = "Близнецы";
                } else {
                    zodiacZnak = "Рак";
                }
                break;
            case 7:
                if (day < 23) {
                    zodiacZnak = "Рак";
                } else {
                    zodiacZnak = "Лев";
                }
                break;
            case 8:
                if (day < 23 ) {
                    zodiacZnak = "Лев";
                } else {
                    zodiacZnak = "Дева";
                }
                break;
            case 9:
                if (day < 23) {
                    zodiacZnak = "Дева";
                } else {
                    zodiacZnak = "Весны";
                }
                break;
            case 10:
                if (day <23) {
                    zodiacZnak = "Весы";
                } else {
                    zodiacZnak = "Скорпион";
                }
                break;
            case 11:
                if (day < 23) {
                    zodiacZnak = "Скорпион";
                } else {
                    zodiacZnak = "Стрелец";
                }
                break;
            case 12:
                if (day < 22) {
                    zodiacZnak = "Стрелец";
                } else {
                    zodiacZnak = "Козерог";
                }
                break;
        }
        System.out.println("Знак: " + zodiacZnak);
        System.out.println("Год: " + zodiacGod);
    }
}
