package sample.cafekiosk.unit.beverage;

public class Latte implements Beverage{
    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public String getName() {
        return "라떼";
    }
}
