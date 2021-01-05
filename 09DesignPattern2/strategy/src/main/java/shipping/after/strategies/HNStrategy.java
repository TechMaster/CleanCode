package shipping.after.strategies;

import shipping.after.ShippingStrategy;

/**
 * Concrete strategy
 */
public class HNStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 10000;
    }

}
