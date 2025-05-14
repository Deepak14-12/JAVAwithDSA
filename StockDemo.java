package stock;
import java.util.Scanner;

public class StockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products to manage: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Stock stock = new Stock(n);

        int choice;
        do {
            System.out.println("\n--- STOCK MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. Show All Products");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    stock.addProduct(sc);
                    break;
                case 2:
                    stock.showAllProducts();
                    break;
                case 3:
                    System.out.print("Enter product index to edit (1 to " + stock.count + "): ");
                    int editIndex = sc.nextInt();
                    sc.nextLine();
                    stock.editProduct(editIndex - 1, sc);
                    break;
                case 4:
                    System.out.print("Enter product index to delete (1 to " + stock.count + "): ");
                    int deleteIndex = sc.nextInt();
                    sc.nextLine();
                    stock.deleteProduct(deleteIndex - 1);
                    break;
                case 5:
                    System.out.println(" Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
