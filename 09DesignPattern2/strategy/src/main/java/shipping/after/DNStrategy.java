package shipping.after;

// Concrete strategy
public class DNStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 20000;
    }

}
