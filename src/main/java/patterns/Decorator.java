package patterns;

import patterns.iface.decorator.Sandwich;

public abstract class Decorator extends Sandwich {

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public abstract double calculatePrice();
}
