package logistics.after;

// Concrete product
public class Train implements Transport {

    @Override
    public void deliver(String goods, String location) {
        System.out.println(String.format("Train is delivering %s to %s", goods, location));
    }
}

