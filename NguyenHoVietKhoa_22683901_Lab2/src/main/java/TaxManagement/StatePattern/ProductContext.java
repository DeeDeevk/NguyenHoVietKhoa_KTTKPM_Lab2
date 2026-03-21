package TaxManagement.StatePattern;

public class ProductContext {
    private ProductState state = new UnpaidState();
    public void setState(ProductState state) { this.state = state; }
    public void apply() { state.process(this); }
}
