package PaymentSystem.StatePattern;

public class CompletedState implements TransactionState{
    public void next(TransactionContext context) { System.out.println("Giao dịch đã hoàn tất."); }
    public String getStatus() { return "Thành công"; }
}
