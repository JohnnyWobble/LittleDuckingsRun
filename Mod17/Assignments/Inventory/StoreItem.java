/**
 * 
 * @author Max Gordon
 * @version 04/08/2020
 */

public class StoreItem {
    private int productNumber, quantity;
    private String name;
    private double price;

    public StoreItem(String name, double price, int quantity, int productNumber) {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%-30s  $%-5.2f  %6d  %15d", name, price, quantity, productNumber);
    }

    public static String getHeader() {
        return "Name                           Price     Quantity   Product Number\n------------------------------------------------------------------";
    }
}