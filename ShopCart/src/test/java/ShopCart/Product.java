package ShopCart;

public class Product {
private String name;
private int unitPrice;
private int gstPercentage;
private int quantity;
public Product(String name, int unitPrice, int gstPercentage, int quantity) {
this.name = name;
this.unitPrice = unitPrice;
this.gstPercentage = gstPercentage;
this.quantity = quantity;
}
public String getName() {
return name;
}
public int getUnitPrice() {
return unitPrice;
}
public int getGstPercentage() {
return gstPercentage;
}
public int getQuantity() {
return quantity;
}
public int getTotalPrice() {
int totalPrice = unitPrice * quantity;
if (unitPrice >= 500) {
totalPrice -= (totalPrice * 5) / 100; // Apply 5% discount
}
return totalPrice;
}
public int getGstAmount() {
return (getTotalPrice() * gstPercentage) / 100;
}
}