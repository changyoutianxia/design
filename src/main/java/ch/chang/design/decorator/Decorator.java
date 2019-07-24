package ch.chang.design.decorator;

public class Decorator extends Drink {
    private Drink drink;


    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " " + drink.getDesc();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + drink.getPrice();
    }
}
