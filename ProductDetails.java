class ProductDetails {
    int newQty;
    double rate;
    String date;
    Product p[];

    void show(Scanner sc) {
        System.out.print("Enter new quantity to add: ");
        newQty = sc.nextInt();
        System.out.print("Enter rate: ");
        rate = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter date (yyyy-mm-dd): ");
        date = sc.nextLine();
    }

    void display() {
        System.out.println("New Quantity: " + newQty);
        System.out.println("Rate: " + rate);
        System.out.println("Date: " + date);
    }
}
