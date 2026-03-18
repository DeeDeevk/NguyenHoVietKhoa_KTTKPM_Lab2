package OrderManagement.StatePattern;

import OrderManagement.OrderContext;

public class ProccessingState implements OrderState{
    @Override
    public void handle(OrderContext orderContext) {
        System.out.println("ĐANG XỬ LÝ: Đóng gói và bàn giao cho bên vận chuyển");
        orderContext.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "Đang xử lý";
    }
}
