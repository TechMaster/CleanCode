package house.after4;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;
import lombok.Data;

public class House {

    private int windows;
    private int doors;
    private int rooms;
    private Garage garage;
    private SwimmingPool swimmingPool;
    private Garden garden;

    private House() {
    }

    public House(HouseBuilder builder) {
        this.windows = builder.getWindows();
        this.doors = builder.getDoors();
        this.rooms = builder.getRooms();
        this.garage = builder.getGarage();
        this.swimmingPool = builder.getSwimmingPool();
        this.garden = builder.getGarden();
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public Garage getGarage() {
        return garage;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public Garden getGarden() {
        return garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", garden=" + garden +
                '}';
    }

}
