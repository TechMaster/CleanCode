package shipping.after;

// Context
public class ShippingService {

    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculateFee() {
        return strategy.calculateFee();
    }

}
