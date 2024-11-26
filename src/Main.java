import Entities.*;

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

        System.out.println("Enter order data: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?");
        int numberItems = scanner.nextInt();

        for (int i = 0; i < numberItems; i++) {

            System.out.println("Enter #" + (i + 1) + " item data:");

            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Product price: ");
            Double productPrice = scanner.nextDouble();

            System.out.println("Product quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        scanner .close();
    }
}