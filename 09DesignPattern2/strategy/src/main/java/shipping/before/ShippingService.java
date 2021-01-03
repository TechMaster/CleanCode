package shipping.before;

public class ShippingService {

    public int calculateFee(String location) {
        if (location.equals("HN")) {
            return 10000;
        } else if (location.equals("DN")) {
            return 20000;
        } else if (location.equals("HCM")) {
            return 30000;
        } else {
            return 50000;
        }
    }

}
