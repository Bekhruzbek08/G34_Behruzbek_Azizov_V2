import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Owner owner = new Owner();
        Customer customer = new Customer();

        while (true) {
            System.out.println("                     \n" + "WELCOME TO OUR ONLINE STORE🏪😊\n" + "                                ");
            System.out.println("1. Owner Login\n" + "2. Customer Login\n" + "0. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Owner menu\n" + "1.Add product\n" + "2.Delete product\n" + "3.Edit product\n");

                int ownerChoice = scanner.nextInt();
                if (ownerChoice == 1) {
                    System.out.println("Enter product details:");
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Category: ");
                    String category = scanner.next();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    owner.addProduct(name, category, price, quantity);
                } else if (ownerChoice == 2) {


                } else if (ownerChoice == 3) {
                    System.out.println("What product do you want to edit:");
                    public void editProduct(int productId, String name, String category, double price, int quantity) {
                        if (products.containsKey(productId)) {
                            Product editedProduct = products.get(productId);
                            editedProduct.setName(name);
                            editedProduct.setCategory(category);
                            editedProduct.setPrice(price);
                            editedProduct.setQuantity(quantity);
                            System.out.println("Product edited: " + editedProduct);
                        } else {
                            System.out.println("Product not found. Edit failed.");
                        }
                    }

                }
            } else if (choice == 2) {
                System.out.println("Customer Menu:\n " + "1.See all product by category\n" + "2.Purchase product\n");


                int customerChoice = scanner.nextInt();
                if (customerChoice == 2) {
                    System.out.println("Enter product ID and quantity:");
                    System.out.print("Product ID: ");
                    int productId = scanner.nextInt();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    customer.purchaseProduct(productId, quantity, owner.getProducts());
                }
            } else if (choice == 0) {
                System.out.println("                                       \n" + "THANKS YOU FOR USING OUR  ONLINE SHOP😊\n" + "                                       ");
                break;
            }
        }
    }
}