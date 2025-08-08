public class ScreenMonitor {

    public final int diagonal; // Диагональ
    public ScreenMonitorType type; // Тип(IPS,TN,VA)
    public double weight; // Вес

    public ScreenMonitor(double diagonal, ScreenMonitorType type, double weight) {
        this.diagonal = (int) diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getType() {
        return diagonal;
    }

    public ScreenMonitorType getVolume() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "Диагональ: " + diagonal + "\n" +
                "Матрица: " + type + "\n" +
                "Вес: " + weight;
    }
}


