package patterns.model.decorator;

import patterns.Decorator;
import patterns.iface.decorator.Sandwich;

public class CheeseDecorator extends Decorator {
    Sandwich sandwich;

    public CheeseDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Cheese";
    }

    @Override
    public double calculatePrice() {
        return this.sandwich.calculatePrice() + 2.05;
    }
}
