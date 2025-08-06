public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        calculator.calculate(Operation.ADD, 5,4);
        calculator.calculate(Operation.SUBTRACT,5,4);
        calculator.calculate(Operation.MULTIPLY,5,4);
        System.out.println(Operation.ADD + " = 5 + 4");
        System.out.println(Operation.SUBTRACT + " = 5 * 4");
        System.out.println(Operation.MULTIPLY + " = 5 - 4");
        ;
    }

}
