package patterns.iface.decorator;

public abstract class Sandwich {
    public String description = "Sandwich ";

    public String getDescription() {
        return description;
    }

    public abstract double calculatePrice();
}
