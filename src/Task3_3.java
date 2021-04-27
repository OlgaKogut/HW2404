public class Task3_3 {
    public static void main(String[] args) {
        int a = 42;

        if (a > 10) {
            System.out.println("Більше 10");
        }

        if (a < 100) {
            System.out.println("Менше 100");
        }

        if (a / 2 > 20) {
            System.out.println("Результат ділення на два більше 20");
        }

        if (a >= 5 && a <= 40) {
            System.out.println("значення змінної в проміжку 5 і 40 включно");
        } else
            System.out.println("значення змінної менше 5, або більше 40");
    }
}
