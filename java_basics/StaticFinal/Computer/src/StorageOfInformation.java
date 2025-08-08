public class StorageOfInformation {
    public StorageOfInformationType type; // Тип (HDD,SSD)
    public int volume; // Объем памяти
    public double weight; // Вес

    public StorageOfInformation(StorageOfInformationType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public StorageOfInformationType getType() {
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
                "Объем памяти: " + volume + "\n" +
                "Вес: " + weight;
    }
}

