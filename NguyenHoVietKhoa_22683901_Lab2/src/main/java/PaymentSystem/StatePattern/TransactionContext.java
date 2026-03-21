package PaymentSystem.StatePattern;

public class TransactionContext {
    private TransactionState state = new PendingState();
    public void setState(TransactionState state) {
        this.state = state;
        System.out.println("--> Hệ thống chuyển sang trạng thái: " + state.getStatus());
    }
    public void processTransaction() {
        state.getStatus();
    }
    public void nextStep() {
        state.next(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
