public class Keyboard {
    public String  type; // Тип (HDD,SSD)
    public boolean rgb; // Объем памяти
    public double weight; // Вес

    public Keyboard(String type, boolean rgb, double weight) {
        this.type = type;
        this.rgb = rgb;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean getRgb() {
        return rgb;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "Тип: " + type + "\n" +
                "Подсветка: " + rgb + "\n" +
                "Вес: " + weight;
    }
}

