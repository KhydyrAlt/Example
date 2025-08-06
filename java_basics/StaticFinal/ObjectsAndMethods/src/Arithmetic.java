public class Arithmetic {

    private int firstNumber;
    private int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getSumOfNumbers() {
        return firstNumber + secondNumber;
    }

    public int getDifferenceOfNumbers(){
        return firstNumber / secondNumber;
    }

    public int getProductsOfNumbers(){
        return firstNumber * secondNumber;
    }

    public int maxNumbers() {
        return firstNumber<secondNumber? secondNumber : firstNumber;
    }

    public int minNumbers() {
        return firstNumber>secondNumber? secondNumber : firstNumber;
    }

    public int averageNumber() {
        return (firstNumber+secondNumber) /2;
    }
}
