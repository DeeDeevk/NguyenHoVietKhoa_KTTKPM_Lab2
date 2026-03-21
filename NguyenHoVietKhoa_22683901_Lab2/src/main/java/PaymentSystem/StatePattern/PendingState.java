package PaymentSystem.StatePattern;

public class PendingState implements TransactionState{
    public void next(TransactionContext context) { context.setState(new CompletedState()); }
    public String getStatus() { return "Đang chờ xử lý"; }
}
