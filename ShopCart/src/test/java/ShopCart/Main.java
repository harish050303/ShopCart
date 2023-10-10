package ShopCart;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
Product leatherWallet = new Product("Leather wallet", 1100, 18, 1);
Product umbrella = new Product("Umbrella", 900, 12, 4);
Product cigarette = new Product("Cigarette", 200, 28, 3);
Product honey = new Product("Honey", 100, 0, 2);
// Add the products to a list or any other suitable data structure
List<Product> basket = new ArrayList<Product>();
basket.add(leatherWallet);
basket.add(umbrella);
basket.add(cigarette);
basket.add(honey);
// Identify the product for which we paid maximum GST amount
Product maxGstProduct = null;
int maxGstAmount = 0;
for (Product product : basket) {
int gstAmount = product.getGstAmount();
if (gstAmount > maxGstAmount) {
maxGstAmount = gstAmount;
maxGstProduct = product;
}
}
System.out.println("Product with maximum GST amount: " +
maxGstProduct.getName());
// Calculate the total amount to be paid to the shopkeeper
int totalAmount = 0;
for (Product product : basket) {
totalAmount += product.getTotalPrice();
}
System.out.println("Total amount to be paid: " + totalAmount);
}
}