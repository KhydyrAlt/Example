public class ArithmeticCalculator {
    public static int a;
    public static int b;
    public Operation operation;

    public ArithmeticCalculator(Operation operation) {
        this.operation = operation;
    }

    public ArithmeticCalculator() {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation operation, int a, int b) {
        int c;
        if (operation == Operation.ADD) {
            c = a + b;
            System.out.println(" 5 + 4 = " + c);
        }
        else if (operation == Operation.SUBTRACT) {
            c = a * b;
            System.out.println(" 5 * 4 = " + c);
        }
        else if (operation == Operation.MULTIPLY) {
            c = a - b;
            System.out.println(" 5 - 4 = " + c);
        }
    }

    public Operation getOperation() {
        return operation;
    }

}
