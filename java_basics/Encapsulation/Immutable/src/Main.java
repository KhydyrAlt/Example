public class Main {
    public static void main(String[] args) {

        Product milk = new Product("Milk", 80, 123456);
        Product bread = new Product("Bread", 50, 789012);


        System.out.println(milk);
        System.out.println(bread);


        Product anotherMilk = new Product("Milk Premium", 90, 123456);
        System.out.println("\nComparison:");
        System.out.println("milk equals anotherMilk: " + milk.equals(anotherMilk));
        System.out.println("milk equals bread: " + milk.equals(bread));

    }
}