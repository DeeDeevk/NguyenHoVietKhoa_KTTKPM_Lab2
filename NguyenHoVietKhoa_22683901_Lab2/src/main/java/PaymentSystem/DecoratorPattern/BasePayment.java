package PaymentSystem.DecoratorPattern;

public class BasePayment implements PaymentRequest{
    private double amount;
    public BasePayment(double amount) { this.amount = amount; }
    public double getAmount() { return amount; }
    public String getDescription() { return "Thanh toán gốc"; }
}
