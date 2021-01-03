package logistics.before;

public class Ship {

    public Ship() {}

    public void deliver(String goods, String location) {
        System.out.printf("Ship is delivering %s to %s%n", goods, location);
    }

}
