public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(4600, 8, "AMD Ryzen 7 5800X3D",0.5);
        RandomAccessMemory randomAccessMemory = new RandomAccessMemory("DDR4",32,0.5);
        StorageOfInformation storageOfInformation = new StorageOfInformation
                (StorageOfInformationType.SSD, 256,1);
        ScreenMonitor screenMonitor = new ScreenMonitor(23.5, ScreenMonitorType.TN, 0.8);
        Keyboard keyboard = new Keyboard("Механическая", false, 0.25);
        Computer computer = new Computer("Aorus", "My PC");
        computer.setProcessor(processor);
        computer.setRandomAccessMemory(randomAccessMemory);
        computer.setStorageOfInformation(storageOfInformation);
        computer.setScreenMonitor(screenMonitor);
        computer.setKeyboard(keyboard);
        System.out.println(computer);

    }
}

