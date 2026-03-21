package PaymentSystem.DecoratorPattern;

public abstract class PaymentDecorator implements PaymentRequest{
    protected PaymentRequest innerRequest;
    public PaymentDecorator(PaymentRequest request) { this.innerRequest = request; }
}
