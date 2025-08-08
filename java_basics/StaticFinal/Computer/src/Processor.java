public class Processor {

    public final int frequency; // Частота
    public final int numberOfCores; // Количество ядер
    public String manufacturer; // Производитель
    public double weight; // Вес

    public Processor(int frequency,int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Частота: " + frequency + "\n" +
                "Количество ядер: " + numberOfCores + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Вес: " + weight;
    }
}

