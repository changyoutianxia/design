package ch.chang.design.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Drink milk = new Milk();
        milk = new SugarDecorator(milk);
        milk = new SugarDecorator(milk);
        milk = new SugarDecorator(milk);
        milk = new SugarDecorator(milk);
        System.out.println(milk.cost());
    }
}
