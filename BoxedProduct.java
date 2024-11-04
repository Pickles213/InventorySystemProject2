package InventorySystemProject;
public class BoxedProduct {
    private String brand;
    private int itemsPerBox;
    private int quantity;

    public BoxedProduct(String brand, int itemsPerBox, int quantity) {
        this.brand = brand;
        this.itemsPerBox = itemsPerBox;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getItemsPerBox() {
        return itemsPerBox;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalItems() {
        return itemsPerBox * quantity;
    }
}
