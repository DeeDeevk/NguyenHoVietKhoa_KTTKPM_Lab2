package PaymentSystem.DecoratorPattern;

public class ProcessingFeeDecorator extends PaymentDecorator{

    public ProcessingFeeDecorator(PaymentRequest request) { super(request); }
    public double getAmount() { return innerRequest.getAmount() + 2.0; } // Cộng thêm 2$ phí
    public String getDescription() { return innerRequest.getDescription() + " + Phí xử lý (2$)"; }
}
