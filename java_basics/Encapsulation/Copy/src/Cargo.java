public class Cargo {
    private int weight;
    private String address;
    private boolean turn;
    private String regNumber;
    private boolean fragile;
    private final Dimensions size;

    public Cargo(int weight, String address, boolean turn, String regNumber, boolean fragile, Dimensions size) {
        this.weight = weight;
        this.address = address;
        this.turn = turn;
        this.regNumber = regNumber;
        this.fragile = fragile;
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public String toString() {
        return "Вес: " + weight + "\n" + "Адрес: " + address +
                "\n" + "Разрешено ли переворачивать: " + turn + "\n" +
                "Регистрационный номер: " + regNumber + "\n" +
                "Хрупкое: " + fragile + "\n" + size;
    }
}

