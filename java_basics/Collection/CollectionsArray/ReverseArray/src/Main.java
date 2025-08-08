
public class Main {
    public static void main(String[] args) {
        String line = "каждый охотник желает знать, где сидит фазан";
        String[] colors = line.split(",?\\s+");
        String[] reverseArrayColors = ReverseArray.reverse(colors);
        for(String reverseArrayColor : reverseArrayColors) {
            System.out.println(reverseArrayColor);

        }
    }
}
