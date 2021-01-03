package builder.before2;

import builder.model.Garage;
import builder.model.Garden;
import builder.model.SwimmingPool;
import lombok.Data;

@Data
public class House {

    private int windows;

    private int doors;

    private int rooms;

    private Garage garage;

    private SwimmingPool swimmingPool;

    private Garden garden;

    public House(int windows, int doors, int rooms, Garage garage, SwimmingPool swimmingPool, Garden garden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
    }
}
