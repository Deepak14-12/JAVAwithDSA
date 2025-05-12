class Product {
    String name;
    String code;
    int quantity;
    double price;

    Product() {
    }

    void show(Scanner sc) {
        System.out.print("Enter product name: ");
        name = sc.nextLine();
        System.out.print("Enter product code: ");
        code = sc.nextLine();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter price: ");
        quantity = sc.nextDouble();
        sc.nextLine();
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Code: " + code);
        System.out.println("Quantity: " + quantity);
    }
}
