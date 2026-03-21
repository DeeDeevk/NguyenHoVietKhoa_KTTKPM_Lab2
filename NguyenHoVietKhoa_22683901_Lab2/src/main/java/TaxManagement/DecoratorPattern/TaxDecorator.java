package TaxManagement.DecoratorPattern;

import TaxManagement.StrategyPattern.TaxStrategy;

public abstract class TaxDecorator implements Product{
    protected Product product;
    protected TaxStrategy strategy;

    public TaxDecorator(Product product, TaxStrategy strategy) {
        this.product = product;
        this.strategy = strategy;
    }

    @Override
    public double getPrice() {
        return product.getPrice() * strategy.calculate(product.getPrice());
    }

    @Override
    public String getName() {
        return product.getName();
    }
}
