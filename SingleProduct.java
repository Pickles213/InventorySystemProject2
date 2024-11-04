package InventorySystemProject;
public class SingleProduct {
    private String brand;
    private int quantity;

    public SingleProduct(String brand, int quantity) {
        this.brand = brand;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }
}
