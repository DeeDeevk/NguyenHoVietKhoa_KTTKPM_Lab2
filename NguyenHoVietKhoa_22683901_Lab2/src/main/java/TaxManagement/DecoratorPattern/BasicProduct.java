package TaxManagement.DecoratorPattern;

public class BasicProduct implements Product{
    double price;
    String name;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
