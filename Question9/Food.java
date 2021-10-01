package Question9;

public abstract class Food extends Product implements Edible,Consumable{


    public Food(String name, double price) {
        super(name, price);
    }
}
