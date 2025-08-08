import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = new Scanner(System.in).nextLine();
            if (phoneBook.isName(input)) {
                if (!phoneBook.getContactByName(input).isEmpty()) {
                    System.out.println(phoneBook.getContactByName(input));
                    continue;
                }
                System.out.println("Такого имени в телефонной книге нет.\n" +
                        "Введите номер телефона для абонента " + "\"" + input + "\":");
                String phoneInput = new Scanner(System.in).nextLine();
                if (phoneBook.isPhone(phoneInput)) {
                    phoneBook.addContact(phoneInput, input);
                    System.out.println("Контакт сохранен!");
                    continue;
                }
            } else if (phoneBook.isPhone(input)) {
                if (!phoneBook.getContactByPhone(input).isEmpty()) {
                    System.out.println(phoneBook.getContactByPhone(input));
                    continue;
                }
                System.out.println("Такого номера нет в телефонной книге.\n" +
                        "Введите имя абонента для номера " + "\"" + input + "\":");
                String nameInput = new Scanner(System.in).nextLine();
                phoneBook.addContact(input, nameInput);
                continue;
            } else if (input.equals("LIST")) {
                for (String contacts : phoneBook.getAllContacts()) {
                    System.out.println(contacts);
                }
                continue;
            }
            System.out.println("Неверный формат ввода");
        }
    }
}
