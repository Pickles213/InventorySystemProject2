package InventorySystemProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagement inventory = new InventoryManagement();

        while (true) {
            System.out.println("Options:");
            System.out.println("[1] Add Single Product");
            System.out.println("[2] Add Box Product");
            System.out.println("[3] Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                break;
            }

            System.out.print("Brand: ");
            String brand = scanner.next();

            if (choice == 1) {
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                SingleProduct singleProduct = new SingleProduct(brand, quantity);
                inventory.addSingleProduct(singleProduct);
            } else if (choice == 2) {
                System.out.print("Items in Box: ");
                int itemsPerBox = scanner.nextInt();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                BoxedProduct boxedProduct = new BoxedProduct(brand, itemsPerBox, quantity);
                inventory.addBoxedProduct(boxedProduct);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        inventory.generateReport();
        scanner.close();
    }
}
