import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate today = LocalDate.now().plusDays(1);
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter format = DateTimeFormatter.ofPattern(" - dd.MM.yyyy - E", Locale.ENGLISH);
        int number = 0;

        String text = "";

        while (birthday.isBefore(today)) {

            String numberB = String.valueOf(number);
            text = text + numberB + format.format(birthday) + System.lineSeparator();
            number++;
            birthday = birthday.plusYears(1);
        }
        return text;
    }

}


