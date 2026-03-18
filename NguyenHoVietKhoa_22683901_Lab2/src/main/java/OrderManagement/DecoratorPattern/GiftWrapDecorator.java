package OrderManagement.DecoratorPattern;

public class GiftWrapDecorator extends OrderDecorator{
    public GiftWrapDecorator(Order order) { super(order); }
    public double getCost() { return super.getCost() + 5.0; }
    public String getDescription() { return super.getDescription() + " + Gói quà"; }
}
