package stock;
import java.util.Scanner;

public class Stock {
    Product[] products;
    int count;

    public Stock(int capacity) {
        products = new Product[capacity]; // Array of objects
        count = 0;
    }

    public void addProduct(Scanner sc) {
        if (count < products.length) {
            Product p = new Product();
            p.inputProduct(sc);
            products[count++] = p;
            System.out.println("Product added.");
        } else {
            System.out.println("Stock full. Cannot add more products.");
        }
    }

    public void showAllProducts() {
        if (count == 0) {
            System.out.println(" No products to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Product [" + (i + 1) + "]:");
            products[i].displayProduct();
            System.out.println("---------------------");
        }
    }

    public void editProduct(int index, Scanner sc) {
        if (index >= 0 && index < count) {
            products[index].editProduct(sc);
            System.out.println(" Product updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                products[i] = products[i + 1];
            }
            products[--count] = null;
            System.out.println("Product deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
