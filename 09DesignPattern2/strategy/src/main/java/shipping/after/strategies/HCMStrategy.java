package shipping.after.strategies;

import shipping.after.ShippingStrategy;

/**
 * Concrete strategy
 */
public class HCMStrategy implements ShippingStrategy {

    @Override
    public int calculateFee() {
        return 30000;
    }

}
