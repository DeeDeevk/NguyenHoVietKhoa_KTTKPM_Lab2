package TaxManagement.StatePattern;

public class UnpaidState implements ProductState {
    public void process(ProductContext context) {
        System.out.println("Sản phẩm chưa đóng thuế. Đang tính toán...");
        context.setState(new PaidState());
    }
}
