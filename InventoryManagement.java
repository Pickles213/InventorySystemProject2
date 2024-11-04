package InventorySystemProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<String, Integer> singleProducts = new HashMap<>();
    private Map<String, Integer> boxProducts = new HashMap<>();
    private Map<String, Integer> totalPieces = new HashMap<>();

    public void addSingleProduct(SingleProduct product) {
        String brand = product.getBrand();
        int quantity = product.getQuantity();

        singleProducts.put(brand, singleProducts.getOrDefault(brand, 0) + quantity);
        totalPieces.put(brand, totalPieces.getOrDefault(brand, 0) + quantity);
    }

    public void addBoxedProduct(BoxedProduct product) {
        String brand = product.getBrand();
        int quantity = product.getQuantity();
        int totalItems = product.getTotalItems();

        boxProducts.put(brand, boxProducts.getOrDefault(brand, 0) + quantity);
        totalPieces.put(brand, totalPieces.getOrDefault(brand, 0) + totalItems);
    }

    public void generateReport() {
        System.out.println("\n-Inventory Report-");

        for (String brand : totalPieces.keySet()) {
            int singles = singleProducts.getOrDefault(brand, 0);
            int boxes = boxProducts.getOrDefault(brand, 0);
            int total = totalPieces.get(brand);

            System.out.println("Brand " + brand);
            System.out.println("Singles: " + singles);
            System.out.println("Boxes: " + boxes);
            System.out.println("Total Pieces: " + total);
        }
    }
}
