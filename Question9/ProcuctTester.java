package Question9;

public class ProcuctTester {
    public static void main(String[] args) {

        Product drink = new CocaCola("coke",1.50);
        Product burger = new CheeseBurger("Big-Mac",3.25);
        Product batteries = new Batteries("Big-Mac",3.25);
        Product car = new Car("Supra",69000.10);

        Product[] productObjects = new Product[4];
        productObjects [0] = drink;
        productObjects [1] = burger;
        productObjects [2] = batteries;
        productObjects [3] = car;


        // got stuck here on giving them an expiration date not sure if correct

        drink.expirationDate.setDay("9");
        drink.expirationDate.setMonth("January");
        drink.expirationDate.setYear("2025");

        burger.expirationDate.setDay("14");
        burger.expirationDate.setMonth("october");
        burger.expirationDate.setYear("2021");






//        CocaCola[]cocaColaObjects = new CocaCola[0];
//        cocaColaObjects[0]=new CocaCola("coke",2.50);
//
//        CheeseBurger[]cheeseBurgerObjects = new CheeseBurger[0];
//        cheeseBurgerObjects[0]=new CheeseBurger("Big-Mac",5.50);
//
//        Batteries[]batteryObjects = new Batteries[0];
//        batteryObjects[0]=new Batteries("Duracell",7.75);
//
//        Car[]carObjects = new Car[0];
//        carObjects[0]=new Car("Supra",69000.10);
























    }
}
