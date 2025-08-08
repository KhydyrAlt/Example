import java.util.*;

public class EmailList {
    private final TreeSet<String> emailList = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public void add(String email) {
        String trimmedEmail = email.trim();

        if (trimmedEmail.matches(EMAIL_PATTERN)) {
            String normalizedEmail = trimmedEmail.toLowerCase();
            if (!emailList.add(normalizedEmail)) {
                System.out.println("Этот email уже существует в списке");
            }
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    // Метод теперь правильно называется getSortedEmails (с 'i')
    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }
}