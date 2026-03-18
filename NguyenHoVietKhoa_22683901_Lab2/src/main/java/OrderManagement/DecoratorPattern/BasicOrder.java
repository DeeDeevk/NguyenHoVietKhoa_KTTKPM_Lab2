package OrderManagement.DecoratorPattern;

public class BasicOrder implements Order{
    @Override
    public double getCost() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Đơn hàng gốc";
    }
}
