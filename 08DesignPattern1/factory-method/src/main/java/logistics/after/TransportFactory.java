package logistics.after;

/**
 * Creator
 */
public class TransportFactory {

    public Transport createTransport(String location) {
        if ("HCM".equalsIgnoreCase(location)) {
            return new Train();
        } else if ("Foreign".equalsIgnoreCase(location)) {
            return new Ship();
        } else {
            return new Truck();
        }
    }

}
