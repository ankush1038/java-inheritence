import java.util.*;

// Base class: Order
class Order {

    protected String orderId;
    protected String orderDate;

    // Constructor to initialize Order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {

    protected String trackingNumber;

    // Constructor to initialize ShippedOrder details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Overriding displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor to initialize DeliveredOrder details
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Overriding displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to test Order Management
public class OnlineRetailOrder {
    public static void main(String[] args) {

        // Creating an instance of DeliveredOrder
        DeliveredOrder order = new DeliveredOrder("ORD12345", "2025-03-17", "TRK98765", "2025-03-20");

        // Displaying order details
        order.displayOrderDetails();
    }
}
