package Question9;

public class Car extends Product{

    public Car(String name, double price) {
        super(name, price);
    }


    // come back to this as well
    @Override
    public double calculateDiscount() {
        return 0;
    }
}
