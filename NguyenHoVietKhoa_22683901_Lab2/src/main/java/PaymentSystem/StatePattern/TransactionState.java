package PaymentSystem.StatePattern;

public interface TransactionState {
    void next(TransactionContext context);
    String getStatus();
}
