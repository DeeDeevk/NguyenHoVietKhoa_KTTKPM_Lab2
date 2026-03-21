package TaxManagement.StrategyPattern;

public class LuxuryTax implements TaxStrategy{
    @Override
    public double calculate(double price) {
        return price * 0.3;
    }
}
