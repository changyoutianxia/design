package ch.chang.design.decorator;

public class Milk extends Drink {

    public Milk() {
        super.setPrice(5.0d);
        super.setDesc("milk");
    }

    public double cost() {
        return super.getPrice();
    }


}
