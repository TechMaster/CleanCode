package logistics.after;

/**
 * Concrete product
 */
public class Ship implements Transport {

    @Override
    public void deliver(String goods, String location) {
        System.out.printf("Ship is delivering %s to %s%n", goods, location);
    }

}
