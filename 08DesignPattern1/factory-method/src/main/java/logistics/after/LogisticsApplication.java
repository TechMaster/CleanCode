package logistics.after;

/**
 * Client
 */
public class LogisticsApplication {

    public static void main(String[] args) {
        processGoods("Smartphone", "HN");
    }

    private static void processGoods(String goods, String location) {
        System.out.printf("Packing %s%n", goods);
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.createTransport(location);
        transport.deliver(goods, location);
        System.out.printf("Unpacking %s%n", goods);
    }

}
