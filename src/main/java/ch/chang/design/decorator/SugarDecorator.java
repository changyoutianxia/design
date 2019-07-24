package ch.chang.design.decorator;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Drink drink) {
        super(drink);
        setDesc("sugar");
        setPrice(6.5d);
    }

}
