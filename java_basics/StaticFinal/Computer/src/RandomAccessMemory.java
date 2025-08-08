public class RandomAccessMemory {
    public String type; // Тип (DDR3,DDR4)
    public int volume; // Объем памяти GB
    public double weight; // Вес

    public RandomAccessMemory(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "Тип: " + type + "\n" +
                "Объем памяти:" + volume + "\n" +
                "Вес: " + weight;
    }

}

