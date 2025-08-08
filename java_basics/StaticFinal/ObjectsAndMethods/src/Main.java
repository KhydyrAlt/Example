public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 40, 1000);
        basket.add("Курица", 150, 700);
        basket.print("");

        System.out.println("Общее количество: " + Basket.getTotalItems());
        System.out.printf("Средняя цена: %.2f руб.", basket.getAveragePrice());
    }
}