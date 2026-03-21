package PaymentSystem.StratrgyPattern;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void collectDetails() {
        System.out.println("Nhập số thẻ tín dụng...");
    }

    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua Thẻ tín dụng.");
    }
}
