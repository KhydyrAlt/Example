import java.net.SocketOption;

public class MainArithmetic {

    public static void main(String[] args) {
        Arithmetic counts = new Arithmetic(10, 2);
        System.out.println("Есть два числа: 10 и 2 " );
        System.out.println("Сумма чисел:   " + counts.getSumOfNumbers());
        System.out.println("Разность чисел:   " + counts.getDifferenceOfNumbers());
        System.out.println("Произведение чисел: " + counts.getProductsOfNumbers());
        System.out.println("большее число:   " + counts.maxNumbers());
        System.out.println("меньшее число:   " + counts.minNumbers());
        System.out.println("среднее число:   " + counts.averageNumber());
    }

}
