package OrderManagement.StrategyPattern;

public class ExpressingShipping implements ShippingState{
    @Override
    public void ship(int orderID) {
        System.out.println("Vận chuyển hỏa tốc đơn hàng #" + orderID);
    }
}
