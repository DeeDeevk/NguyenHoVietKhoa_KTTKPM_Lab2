package OrderManagement;

import OrderManagement.StatePattern.NewOrderState;
import OrderManagement.StatePattern.OrderState;

public class OrderContext {
    private OrderState state = new NewOrderState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void apply() {
        state.handle(this);
    }

    public String getStatus(){
        return state.getStatus();
    }
}
