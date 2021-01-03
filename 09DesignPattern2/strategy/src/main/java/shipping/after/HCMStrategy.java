package shipping.after;

// Concrete strategy
public class HCMStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 30000;
    }

}
