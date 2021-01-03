package shipping.after;

// Concrete strategy
public class HNStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 10000;
    }

}
