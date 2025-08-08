public class SplitText {
    public static String splitTextIntoWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String regex = "[^\\p{L}’'-]+";

        String result = text.replaceAll(regex, "\n")
                .trim()
                .replaceAll("\n+", "\n");

        return result;
    }

    public static void main(String[] args) {
        String testText = "Hello, world! This is a test-string. Don't worry.";
        System.out.println(splitTextIntoWords(testText));
    }
}