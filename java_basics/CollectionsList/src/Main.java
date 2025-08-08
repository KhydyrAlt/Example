import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        printHelp();

        while (true) {
            System.out.print("\nВведите команду: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("EXIT")) break;
            if (input.equalsIgnoreCase("HELP")) {
                printHelp();
                continue;
            }

            String[] parts = input.split("\\s+", 3);
            String command = parts[0].toUpperCase();

            try {
                switch (command) {
                    case "LIST":
                        System.out.println("\nТекущие задачи:\n" + todoList.getAllTasks());
                        break;

                    case "ADD":
                        handleAddCommand(todoList, parts);
                        break;

                    case "EDIT":
                        handleEditCommand(todoList, parts);
                        break;

                    case "DELETE":
                        handleDeleteCommand(todoList, parts);
                        break;

                    default:
                        System.out.println("Неизвестная команда. Введите HELP для справки");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Работа завершена");
    }

    private static void handleAddCommand(TodoList todoList, String[] parts) {
        if (parts.length < 2) {
            System.out.println("Ошибка: укажите задачу для добавления");
            return;
        }

        if (parts.length == 2) {
            todoList.add(parts[1]);
            System.out.println("Задача добавлена: \"" + parts[1] + "\"");
        } else {
            try {
                int index = Integer.parseInt(parts[1]) - 1; // -1 для удобства пользователя
                String task = parts[2];
                todoList.add(index, task);
                System.out.println("Задача добавлена на позицию " + (index + 1) + ": \"" + task + "\"");
            } catch (NumberFormatException e) {
                todoList.add(String.join(" ", parts[1], parts[2]));
                System.out.println("Задача добавлена: \"" + String.join(" ", parts[1], parts[2]) + "\"");
            }
        }
    }

    private static void handleEditCommand(TodoList todoList, String[] parts) {
        if (parts.length < 3) {
            System.out.println("Ошибка: укажите номер и новое название задачи");
            return;
        }

        try {
            int index = Integer.parseInt(parts[1]) - 1;
            String newTask = parts[2];
            todoList.edit(index, newTask);
            System.out.println("Задача изменена: позиция " + (index + 1) + " → \"" + newTask + "\"");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: номер задачи должен быть числом");
        }
    }

    private static void handleDeleteCommand(TodoList todoList, String[] parts) {
        if (parts.length < 2) {
            System.out.println("Ошибка: укажите номер задачи для удаления");
            return;
        }

        try {
            int index = Integer.parseInt(parts[1]) - 1;
            String deletedTask = todoList.delete(index);
            System.out.println("Удалена задача: \"" + deletedTask + "\"");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: номер задачи должен быть числом");
        }
    }

    private static void printHelp() {
        System.out.println("\nДоступные команды:");
        System.out.println("LIST - показать все задачи");
        System.out.println("ADD задача - добавить задачу в конец");
        System.out.println("ADD номер задача - добавить задачу на указанную позицию");
        System.out.println("EDIT номер задача - изменить задачу");
        System.out.println("DELETE номер - удалить задачу");
        System.out.println("HELP - показать эту справку");
        System.out.println("EXIT - выход из программы");
    }
}