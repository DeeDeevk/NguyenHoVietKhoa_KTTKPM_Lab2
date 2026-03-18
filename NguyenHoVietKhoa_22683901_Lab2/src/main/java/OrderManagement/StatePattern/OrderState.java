package OrderManagement.StatePattern;

import OrderManagement.OrderContext;

public interface OrderState {
    void handle(OrderContext orderContext);
    String getStatus();
}
