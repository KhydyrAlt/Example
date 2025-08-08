import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Введите номер этажа (или 'q' для выхода): ");

                if (scanner.hasNextInt()) {
                    int floor = scanner.nextInt();
                    elevator.move(floor);
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("q")) {
                        System.out.println("Выход из программы");
                        break;
                    }
                    System.out.println("Ошибка: введите число или 'q' для выхода");
                }
            }
        } finally {
            scanner.close();
        }
    }
}
