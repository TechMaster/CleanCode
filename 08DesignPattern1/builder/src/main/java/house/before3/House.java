package house.before3;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;
import lombok.Data;

@Data
public class House {

    private int windows;

    private int doors;

    private int rooms;

    private Garage garage;

    private SwimmingPool swimmingPool;

    private Garden garden;

    public House(int windows, int doors, int rooms) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
    }

    public House(int windows, int doors, int rooms, Garage garage) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
    }

    public House(int windows, int doors, int rooms, SwimmingPool swimmingPool) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.swimmingPool = swimmingPool;
    }

    public House(int windows, int doors, int rooms, Garden garden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garden = garden;
    }
}
