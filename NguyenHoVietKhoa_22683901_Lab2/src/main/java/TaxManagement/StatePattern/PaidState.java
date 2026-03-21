package TaxManagement.StatePattern;

public class PaidState implements ProductState{
    @Override
    public void process(ProductContext productContext) {
        ystem.out.println("Sản phẩm đã hoàn tất nghĩa vụ thuế.");
    }
}
