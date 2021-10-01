package Question9;

public class CheeseBurger extends Food{
    public CheeseBurger(String name, double price) {
        super(name, price);
    }

  //  come back to this
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public int consume() {
        return 0;
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
