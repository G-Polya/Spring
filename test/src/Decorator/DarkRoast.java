package Decorator;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "에스프레소";
    }
    public  double cost(){
        return 1.99;
    }
}
