public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1000);
        basket.add("Chicken", 150, 700);
        basket.print("");

        System.out.println(Basket.getCount());
        System.out.println("Средняя цена всех товаров :" + Basket.setAverageItems());
    }
}