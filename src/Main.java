import Entities.Client;
import Entities.Order;
import Entities.OrderStatus;
import Entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Instance for the date pattern on this project
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        // Starting to gather data for the making of client object
        System.out.println("Enter client data:");

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        // Creating the client object
        Client client = new Client(name,email,birthDate);


        // Checking the client object
//        System.out.println(
//                order.getDate() +
//                client.toString()
//        );

        System.out.println("Enter order data: ");
        System.out.println("Status: " + OrderStatus.PROCESSING);

        System.out.println("How many items to this order");
        int numberItems = scanner.nextInt();

        for (int i = 0; i < numberItems; i++) {
            System.out.println("Ennter #" + (i + 1) + " item data:");
            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            System.out.println("Product price: ");
            Double productPrice = scanner.nextDouble();
            System.out.println("Product quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice, productQuantity);
        }

        // Yes, another instance, the order object
        Order order = new Order();

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getDate());
        System.out.println("Order status: " + OrderStatus.PROCESSING);
        System.out.println(
                "Client: " + client.getName() +
                ", " + client.getDateOfBirth() +
                " - " + client.getEmail()
        );
        System.out.println("Order items: ");
        System.out.println();
    }
}