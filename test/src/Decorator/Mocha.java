package Decorator;

public class Mocha extends ContimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", 모카";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
