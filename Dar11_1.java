import java.util.Scanner;

public class Dar11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введи число: ");
            double realNumber = scanner.nextDouble();

            if (realNumber < 0) {
                System.out.println("Твое число в степень 1/2 - отрицательное. Ответ выйдет невещественным числом.19391");
            } else {
                double sqrt = Math.sqrt(realNumber);
                System.out.println("Квадратный корень:" + sqrt);
            }

        } catch (Exception error) {
            System.out.println("Ошибка ввода, введите вещественное число!");
        }
    }
}
