package Question9;

public class Batteries extends Product implements Consumable{


    public Batteries(String name, double price) {
        super(name, price);
    }

    //come back to this and create what the discount is for this.

    @Override
    public double calculateDiscount() {
        return 0;
    }

    //come back to this as well
    @Override
    public int consume() {
        return 4;
    }
}
