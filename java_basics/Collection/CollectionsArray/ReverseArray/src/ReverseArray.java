public class ReverseArray {

    public static String[] reverse (String[] strings){
        for (int i = 0, n = strings.length, m = n-- / 2; i < m; i++) {
            String tmp = strings[i];
            strings[i] = strings[n - i];
            strings[n - i] = tmp;
        }

        return strings;
    }
}
