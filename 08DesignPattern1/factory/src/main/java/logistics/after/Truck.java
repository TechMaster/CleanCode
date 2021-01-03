package logistics.after;

// Concrete product
public class Truck implements Transport {

    @Override
    public void deliver(String goods, String location) {
        System.out.println(String.format("Truck is delivering %s to %s", goods, location));
    }
}

