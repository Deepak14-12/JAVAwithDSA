package stock;
import java.util.Scanner;

public class ProductDetail {
    int newQuantity;
    double rate;
    String purchaseDate;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter additional quantity: ");
        newQuantity = sc.nextInt();
        System.out.print("Enter purchase rate: ");
        rate = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter purchase date (yyyy-mm-dd): ");
        purchaseDate = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("Additional Quantity: " + newQuantity);
        System.out.println("Purchase Rate: " + rate);
        System.out.println("Purchase Date: " + purchaseDate);
    }
}
