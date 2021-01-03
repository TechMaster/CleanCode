package logistics.after;

// Concrete product
public class Ship implements Transport {

    @Override
    public void deliver(String goods, String location) {
        System.out.println(String.format("Ship is delivering %s to %s", goods, location));
    }
}
