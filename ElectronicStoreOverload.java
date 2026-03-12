class DiscountCart {

    void addItem(String productName, double price, int quantity) {
        double total = price * quantity;
        System.out.println("Added: " + quantity + " x " + productName +
                " | Total ₹ " + total);
    }

    void addItem(String productName, double price, int quantity, boolean republicDayOffer) {
        double total = price * quantity;
        double discount = 0;

        if (republicDayOffer && total > 50000) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("Special Offer Active: " + quantity + " x " + productName +
                " | Original ₹ " + total +
                " | Discount ₹ " + discount +
                " | Final Amount ₹ " + finalAmount);
    }
}

public class ElectronicStoreOverload {
    public static void main(String[] args) {

        DiscountCart cart = new DiscountCart();

        cart.addItem("Laptop", 45000, 1);
        cart.addItem("iPhone", 65000, 1, true);
        cart.addItem("Headphones", 2500, 2, false);
    }
}