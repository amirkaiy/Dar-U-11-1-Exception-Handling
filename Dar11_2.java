public class Dar11_2 {
    public static double divide(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Ошибка: деление на 0 невозможно");
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            double result = divide(90, 0); // Здесь можно поменять значения
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
