public class Computer {
    private Processor processor; // Процессор
    private RandomAccessMemory randomAccessMemory; // Оперативная память
    private StorageOfInformation storageOfInformation; // Накопитель информации
    private ScreenMonitor screenMonitor; // Монитор
    private Keyboard keyboard; // Клавиатура
    public final String vendor; // Производительность
    public final String name; // Название
    public double totalWeight; // Общий вес КГ

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public StorageOfInformation getStorageOfInformation () {
        return storageOfInformation;
    }

    public void setStorageOfInformation(StorageOfInformation storageOfInformation) {
        this.storageOfInformation = storageOfInformation;
    }

    public ScreenMonitor getScreenMonitor() {
        return screenMonitor;
    }

    public void setScreenMonitor(ScreenMonitor screenMonitor) {
        this.screenMonitor = screenMonitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }


    public double getTotalWeight() {
        totalWeight = processor.getWeight() + randomAccessMemory.getWeight() +
                screenMonitor.getWeight() + storageOfInformation.getWeight() + keyboard.getWeight();
        return totalWeight;

    }


    public String toString() {
        return  "Характеристики ПК: " + "\n" +
                "Процессор: " + getProcessor() + "\n" +
                "Оперативная память: " + getRandomAccessMemory() + "\n" +
                "Накопитель информации: " + getStorageOfInformation() + "\n" +
                "Монитор: " + getScreenMonitor() + "\n" +
                "Клавиатура: " + getKeyboard() + "\n" +
                "Общий вес ПК: " + getTotalWeight();
    }
}

