import java.util.Objects;

public class Pojo {
    private String name;
    private int populationSize;
    private int areaInSquareKilometers;
    private String country;
    private boolean hasAccessToTheSea;

    // Конструкторы
    public Pojo() {}

    public Pojo(String name, int populationSize, int areaInSquareKilometers,
                String country, boolean hasAccessToTheSea) {
        this.name = name;
        this.populationSize = populationSize;
        this.areaInSquareKilometers = areaInSquareKilometers;
        this.country = country;
        this.hasAccessToTheSea = hasAccessToTheSea;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public int getAreaInSquareKilometers() {
        return areaInSquareKilometers;
    }

    public void setAreaInSquareKilometers(int areaInSquareKilometers) {
        this.areaInSquareKilometers = areaInSquareKilometers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHasAccessToTheSea() {
        return hasAccessToTheSea;
    }

    public void setHasAccessToTheSea(boolean hasAccessToTheSea) {
        this.hasAccessToTheSea = hasAccessToTheSea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return populationSize == pojo.populationSize &&
                areaInSquareKilometers == pojo.areaInSquareKilometers &&
                hasAccessToTheSea == pojo.hasAccessToTheSea &&
                Objects.equals(name, pojo.name) &&
                Objects.equals(country, pojo.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, populationSize, areaInSquareKilometers, country, hasAccessToTheSea);
    }

    @Override
    public String toString() {
        return "Pojo {" +
                "name='" + name + '\'' +
                ", population=" + String.format("%,d", populationSize) +
                ", area=" + String.format("%,d", areaInSquareKilometers) + " km²" +
                ", country='" + country + '\'' +
                ", coastal=" + (hasAccessToTheSea ? "yes" : "no") +
                '}';
    }
}