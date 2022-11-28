import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Здравствуйте,хотите узнать когда ваш профессиональный праздник?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();                   // Scanner (int) ввод числа

        if (isLeapYear(year)) {
            System.out.println("Ваш праздник 13.09." + year);        // Не високосный год
        } else {
            System.out.println("Ваш праздник 12.09." + year);        //Високосный год
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return false;
            } else return year % 400 != 0;
        }
        return true;
    }
}



