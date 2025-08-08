import java.util.Objects;

public record Product(String name, int price, int barCode) {
    public Product {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (barCode <= 0) {
            throw new IllegalArgumentException("Barcode must be positive");
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }

    @Override
    public String toString() {
        return String.format("Product [name='%s', price=%d, barCode=%d]",
                name, price, barCode);
    }
}