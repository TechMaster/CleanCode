package logistics.before;

public class Ship {

    public Ship() {}

    public void deliver(String goods, String location) {
        System.out.println(String.format("Ship is delivering %s to %s", goods, location));
    }
}
