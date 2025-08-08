import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        char[][] xArray = TwoDimensionalArray.getTwoDimensionalArray(5);
        System.out.println(Arrays.deepToString(xArray)
                .replace("],", "]\n")
                .replace(", ", ""));
    }
}