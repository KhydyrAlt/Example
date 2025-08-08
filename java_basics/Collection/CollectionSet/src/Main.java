import java.util.Scanner;

public class Main {
    private static EmailList emailList = new EmailList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                break;
            }

            String[] parts = input.split("\\s+", 2);
            if (parts.length == 0) continue;

            String command = parts[0];

            switch (command) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Ошибка: после ADD должен быть email");
                        continue;
                    }
                    emailList.add(parts[1]);
                    break;

                case "LIST":
                    // Теперь правильно вызываем getSortedEmails()
                    for (String email : emailList.getSortedEmails()) {
                        System.out.println(email);
                    }
                    break;

                default:
                    System.out.println("Ошибка! Неверная команда");
            }
        }
        scanner.close();
    }
}