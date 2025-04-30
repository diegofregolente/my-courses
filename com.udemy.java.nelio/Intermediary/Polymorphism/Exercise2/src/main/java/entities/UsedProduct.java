package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct() {

    }

    public UsedProduct(LocalDate manufactureDate) {
        super();
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(String name, Double price) {
        return name + " (used) $ " + String.format("%¨.2f", price) + " (Manufacture date: " + manufactureDate + ")";
    }
}
