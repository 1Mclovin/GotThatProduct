package Question9;

public class CocaCola extends Drink{
    public CocaCola(String name, double price) {
        super(name, price);
    }

    // come back to this as well
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public int consume() {
        return 2;
    }
}
