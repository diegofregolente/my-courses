package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Product data: " +
                name +
                ", $ " +
                String.format("%.2f", price) +
                ", " +
                quantity +
                " units, Total: " +
                String.format("%.2f", TotalValueInStock());
    }
}
