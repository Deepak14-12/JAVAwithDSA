import java.util.Scanner;

public class SimpleProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        ProductDetails d = new ProductDetails();
        boolean productExists = false;

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Show Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    p.show(sc);
                    d.show(sc);
                    productExists = true;
                    System.out.println("Product added.");
                    break;

                case 2:
                    if (productExists) {
                        System.out.println("Edit product details:");
                        p.show(sc);
                        d.show(sc);
                        System.out.println("Product updated.");
                    } else {
                        System.out.println("No product to edit. Please add first.");
                    }
                    break;

                case 3:
                    if (productExists) {
                        System.out.println("\n--- Product Details ---");
                        p.display();
                        d.display();
                        int totalQty = p.quantity + d.newQty;
                        System.out.println("Total Quantity: " + totalQty);
                    } else {
                        System.out.println("No product to show. Please add first.");
                    }
                    break;

                case 4:
                    if (productExists) {
                        productExists = false;
                        System.out.println("Product deleted.");
                    } else {
                        System.out.println("No product to delete.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
