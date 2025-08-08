import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static int totalItems = 0;
    private List<String> names = new ArrayList<>();
    private List<Integer> prices = new ArrayList<>();
    private List<Integer> weights = new ArrayList<>();

    public void add(String name, int price, int weight) {
        names.add(name);
        prices.add(price);
        weights.add(weight);
        totalItems++;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    public double getAveragePrice() {
        if (prices.isEmpty()) return 0;
        return prices.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void print(String prefix) {
        System.out.println(prefix + "Корзина:");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("- %s: %d руб., %d г\n", names.get(i), prices.get(i), weights.get(i));
        }
        System.out.printf("Итого: %d товаров\n", names.size());
    }
}