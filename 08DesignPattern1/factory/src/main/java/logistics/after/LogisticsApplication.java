package logistics.after;

public class LogisticsApplication {

    public static void main(String[] args) {
        processGoods("Smartphone", "HN");
    }

    private static void processGoods(String goods, String location) {
        System.out.println(String.format("Packing %s", goods));
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.createTransport(location);
        transport.deliver(goods, location);
        System.out.println(String.format("Unpacking %s", goods));
    }
}
