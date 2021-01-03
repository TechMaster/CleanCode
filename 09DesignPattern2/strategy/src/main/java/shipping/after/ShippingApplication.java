package shipping.after;

// Client
public class ShippingApplication {

    public static void main(String[] args) {
        ShippingService service = new ShippingService();

        service.setStrategy(new HNStrategy());
        System.out.println(service.calculateFee());

        service.setStrategy(new DNStrategy());
        System.out.println(service.calculateFee());

        service.setStrategy(new HCMStrategy());
        System.out.println(service.calculateFee());
    }

}
