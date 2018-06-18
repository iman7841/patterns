package patterns.model.decorator;

import patterns.iface.decorator.Sandwich;

public class WhiteBreadSandwich extends Sandwich {
    private static double price = 3.12;

    public WhiteBreadSandwich(String whiteBreadSandwichDescription) {
        this.description = whiteBreadSandwichDescription;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
