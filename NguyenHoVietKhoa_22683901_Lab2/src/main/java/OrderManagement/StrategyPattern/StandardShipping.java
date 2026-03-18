package OrderManagement.StrategyPattern;

public class StandardShipping implements ShippingState{
    @Override
    public void ship(int orderID) {
        System.out.println("Vận chuyển tiêu chuẩn đơn hàng #" + orderID);
    }
}
