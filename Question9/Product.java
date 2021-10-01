package Question9;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    protected ExpirationDate expirationDate;

    public double DISCOUNT_RATE;

    public Product(String name, double price){

    }

    public void printExpirationDate(String product){

    }

    public abstract double calculateDiscount();

    public static void printOrder(String products[]){

    }

    public static void printConsumptionQty( ArrayList<Consumable>String ){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getDISCOUNT_RATE() {
        return DISCOUNT_RATE;
    }

    public void setDISCOUNT_RATE(double DISCOUNT_RATE) {
        this.DISCOUNT_RATE = DISCOUNT_RATE;
    }
}
