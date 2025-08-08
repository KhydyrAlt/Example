

public class SequentialWordsNumbers {
    public static String sequentialWordsNumbers(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int counter = 1;
        String[] words = text.trim().split("\\s+");

        for (String word : words) {
            result.append("(").append(counter++).append(") ").append(word).append(" ");
        }

        return result.toString().trim();
    }
}