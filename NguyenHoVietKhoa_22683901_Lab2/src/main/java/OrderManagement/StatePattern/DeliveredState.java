package OrderManagement.StatePattern;

import OrderManagement.OrderContext;

public class DeliveredState implements OrderState{
    @Override
    public void handle(OrderContext orderContext) {
        System.out.println("ĐÃ GIAO: Cập nhật hệ thống thành công");
    }

    @Override
    public String getStatus() {
        return "Đã giao";
    }
}
