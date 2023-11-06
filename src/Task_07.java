import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_07 {
    public static void main(String[] args) {
        System.out.println("Задание #7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String simvol = sc.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]");
        Matcher matlatletter = patlatletter.matcher(simvol);

        Pattern patkirletter = Pattern.compile("[а-яА-Я]");
        Matcher matkirletter = patkirletter.matcher(simvol);

        Pattern patnumber = Pattern.compile("[0-9]");
        Matcher matnumber = patnumber.matcher(simvol);
            if (matlatletter.matches()) {
                System.out.println("Латиница");
            } else if (matkirletter.matches()) {
                System.out.println("Кириллица");
            } else if (matnumber.matches()) {
                System.out.println("Цифра");
            } else{
                System.out.println("Невозможно определить");
            }
    }
}
