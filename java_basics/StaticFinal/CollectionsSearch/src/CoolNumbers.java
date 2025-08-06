import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String[] lettersForNumbers1 = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] lettersForNumbers2 = new String[(lettersForNumbers1.length - 1) * (lettersForNumbers1.length - 1) + 1];
        for (int i = 0; i < lettersForNumbers1.length; i++) {
            for (int j = 0; j < lettersForNumbers1.length; j++) {
                String builder = lettersForNumbers1[i] +
                        lettersForNumbers1[j];
                lettersForNumbers2[i * 10 + j] = builder;
            }
        }

        String[] digitsForNumbers = new String[9];
        for (int i = 0; i < digitsForNumbers.length; i++) {
            digitsForNumbers[i] = Integer.toString(((i + 1) * 111));
        }

        List<String> coolNumbers = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            StringBuilder region = new StringBuilder();
            String formatRegion = region.append("00").append(i).substring(region.length() - 3);
            for (String digitsForNumber : digitsForNumbers) {
                for (String string : lettersForNumbers1) {
                    for (String s : lettersForNumbers2) {
                        StringBuilder builder = new StringBuilder();
                        coolNumbers.add(builder.append(string).append(digitsForNumber).
                                append(s).append(formatRegion).toString());
                    }
                }
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }
}
