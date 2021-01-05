package shipping.after.strategies;

import shipping.after.ShippingStrategy;

/**
 * Concrete strategy
 */
public class DNStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 20000;
    }

}
