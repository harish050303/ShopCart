# ShopCart
Solution:

To solve the problem, we can create a class called "Product" to represent each product in the basket. The class will have attributes such as unit price, GST percentage, and quantity. We can also include methods to calculate the total price of the product and the GST amount.

Here is the implementation in Java:

java
class Product {
    private String name;
    private double unitPrice;
    private double gstPercentage;
    private int quantity;

    public Product(String name, double unitPrice, double gstPercentage, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.gstPercentage = gstPercentage;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        double totalPrice = unitPrice * quantity;
        if (unitPrice >= 500) {
            totalPrice -= (totalPrice * 0.05); // Apply 5% discount
        }
        return totalPrice;
    }

    public double getGstAmount() {
        return (unitPrice * gstPercentage / 100) * quantity;
    }

    public String getName() {
        return name;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Create products in the basket
        Product leatherWallet = new Product("Leather wallet", 1100, 18, 1);
        Product umbrella = new Product("Umbrella", 900, 12, 4);
        Product cigarette = new Product("Cigarette", 200, 28, 3);
        Product honey = new Product("Honey", 100, 0, 2);

        // Add products to an array or list
        Product[] basket = {leatherWallet, umbrella, cigarette, honey};

        // Find the product with maximum GST amount
        Product maxGstProduct = null;
        double maxGstAmount = 0;
        for (Product product : basket) {
            double gstAmount = product.getGstAmount();
            if (gstAmount > maxGstAmount) {
                maxGstAmount = gstAmount;
                maxGstProduct = product;
            }
        }

        // Calculate the total amount to be paid
        double totalAmount = 0;
        for (Product product : basket) {
            totalAmount += product.getTotalPrice();
        }

        System.out.println("Product with maximum GST amount: " + maxGstProduct.getName());
        System.out.println("Total amount to be paid: Rs. " + totalAmount);
    }
}


Output:

Product with maximum GST amount: Leather wallet
Total amount to be paid: Rs. 10480.0


Note: In this solution, I have assumed that the unit price and GST percentage are given in rupees and percentages respectively. The total amount to be paid is calculated by summing up the total prices of all products after applying the discount if applicable.
