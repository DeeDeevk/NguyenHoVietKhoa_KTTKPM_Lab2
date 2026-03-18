package OrderManagement.StatePattern;

import OrderManagement.OrderContext;

public class NewOrderState implements OrderState {

    @Override
    public void handle(OrderContext orderContext) {
        System.out.println("ĐƠN HÀNG MỚI: Đang kiểm tra thông tin...");
        orderContext.setState(new ProccessingState());
    }

    @Override
    public String getStatus() {
        return "ĐƠN HÀNG MỚI";
    }
}
