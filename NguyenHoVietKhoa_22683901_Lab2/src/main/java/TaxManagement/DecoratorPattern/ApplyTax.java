package TaxManagement.DecoratorPattern;

import TaxManagement.StrategyPattern.TaxStrategy;

public class ApplyTax extends TaxDecorator{
    public ApplyTax(Product product, TaxStrategy strategy) {
        super(product, strategy);
    }
}
