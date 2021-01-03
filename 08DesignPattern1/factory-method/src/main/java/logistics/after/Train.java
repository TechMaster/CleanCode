package logistics.after;

// Concrete product
public class Train implements Transport {

    @Override
    public void deliver(String goods, String location) {
        System.out.printf("Train is delivering %s to %s%n", goods, location);
    }

}
