package shipping.before;

public class ShippingApplication {

    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService();
        System.out.println(shippingService.calculateFee("HN"));
        System.out.println(shippingService.calculateFee("DN"));
        System.out.println(shippingService.calculateFee("HCM"));
    }

}
