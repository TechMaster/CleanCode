package logistics.after;

// Creator
public class TransportFactory {

    public Transport createTransport(String location) {
        if (location.equals("HCM")) {
            return new Train();
        } else if (location.equals("Foreign")) {
            return new Ship();
        } else {
            return new Truck();
        }
    }

}
