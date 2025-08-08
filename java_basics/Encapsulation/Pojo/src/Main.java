public class Main {
    public static void main(String[] args) {
        // Создание объектов через конструктор
        Pojo city1 = new Pojo("Mumbai", 12478447, 603, "India", true);
        Pojo city2 = new Pojo("Berlin", 3769495, 891, "Germany", false);

        // Создание и заполнение через сеттеры
        Pojo city3 = new Pojo();
        city3.setName("New York");
        city3.setPopulationSize(8419000);
        city3.setAreaInSquareKilometers(783);
        city3.setCountry("USA");
        city3.setHasAccessToTheSea(true);

        // Вывод информации
        System.out.println("City 1: " + city1);
        System.out.println("City 2: " + city2);
        System.out.println("City 3: " + city3);

        // Сравнение объектов
        System.out.println("\nComparison:");
        System.out.println("city1 equals city2: " + city1.equals(city2));

        // Создание копии для сравнения
        Pojo city1Copy = new Pojo("Mumbai", 12478447, 603, "India", true);
        System.out.println("city1 equals city1Copy: " + city1.equals(city1Copy));
    }
}