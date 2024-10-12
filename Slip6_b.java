//Create an abstract class “order” having members id, description. Create two subclasses
// “PurchaseOrder” and “Sales Order” having members customer name and Vendor name
//respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase
//Order and Sales Order and accept and display details.


import java.util.Scanner;

abstract class Order {
    String orderId;
    String description;

    public Order(String orderId, String description) {
        this.orderId = orderId;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}

// Subclass "PurchaseOrder"
class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(String orderId, String description, String customerName) {
        super(orderId, description);
        this.customerName = customerName;
    }

    @Override
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        this.orderId = scanner.nextLine();
        System.out.print("Enter Purchase Order Description: ");
        this.description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        this.customerName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Purchase Order ID: " + orderId);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

// Subclass "SalesOrder"
class SalesOrder extends Order {
    private String vendorName;

    public SalesOrder(String orderId, String description, String vendorName) {
        super(orderId, description);
        this.vendorName = vendorName;
    }

    @Override
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        this.orderId = scanner.nextLine();
        System.out.print("Enter Sales Order Description: ");
        this.description = scanner.nextLine();
        System.out.print("Enter Vendor Name: ");
        this.vendorName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Sales Order ID: " + orderId);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class Slip6_b {
    public static void main(String[] args) {
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        SalesOrder[] salesOrders = new SalesOrder[3];

        System.out.println("Enter details for 3 Purchase Orders:");
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i] = new PurchaseOrder("", "", "");
            purchaseOrders[i].accept();
        }

        System.out.println("\nPurchase Order Details:");
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i].display();
        }

        System.out.println("\nEnter details for 3 Sales Orders:");
        for (int i = 0; i < 3; i++) {
            salesOrders[i] = new SalesOrder("", "", "");
            salesOrders[i].accept();
        }

        System.out.println("\nSales Order Details:");
        for (int i = 0; i < 3; i++) {
            salesOrders[i].display();
        }
    }
}
