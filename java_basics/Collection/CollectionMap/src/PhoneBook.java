import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    Map<String, String> phoneBookMap = new TreeMap<>();

    public void addContact(String phone, String name) {
        if (isName(name) && isPhone(phone)) {
            phoneBookMap.put(phone, name);
        } else {
            System.out.println("Неверный формат ввода");
        }
    }

    public String getContactByPhone(String phone) {
        return phoneBookMap.containsKey(phone) ? phoneBookMap.get(phone) + " - " + phone : "";
    }

    public Set<String> getContactByName(String name) {
        Set<String> contactByName = new TreeSet<>();
        for (String key : phoneBookMap.keySet()) {
            if (name.equals(phoneBookMap.get(key))) {
                contactByName.add(phoneBookMap.get(key) + " - " + key);
            }
        }
        return contactByName;
    }

    public Set<String> getAllContacts() {
        Map<String, String> mapForEqualsPhone = new TreeMap<>();
        Set<String> allContacts = new TreeSet<>();

        for (Map.Entry<String, String> entry : phoneBookMap.entrySet()) {
            if (mapForEqualsPhone.containsKey(entry.getValue())) {
                String contact = mapForEqualsPhone.get(entry.getValue());
                mapForEqualsPhone.put(entry.getValue(), contact.concat(", ").concat(entry.getKey()));
            } else {
                mapForEqualsPhone.put(entry.getValue(), entry.getKey());
            }
        }
        for (String key : mapForEqualsPhone.keySet()) {
            allContacts.add(key + " - " + mapForEqualsPhone.get(key));
        }
        return allContacts;
    }

    public boolean isName(String name) {
        Boolean isName = false;
        String regex = "[а-яА-ЯёЁ]+\\s?[а-яА-ЯёЁ]+";
        if (name.matches(regex)) {
            isName = true;
        }
        return isName;
    }

    public boolean isPhone(String phone) {
        Boolean isPhone = false;
        String regex = "(\\+7|8|7)\\d{10}";
        if (phone.matches(regex)) {
            isPhone = true;
        }
        return isPhone;
    }
}
