package PaymentSystem.StratrgyPattern;

public interface PaymentStrategy {
    void collectDetails();
    boolean validate();
    void pay(double amount);
}
