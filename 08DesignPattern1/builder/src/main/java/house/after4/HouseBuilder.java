package house.after4;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

public class HouseBuilder {

    private int windows;
    private int doors;
    private int rooms;
    private Garage garage;
    private SwimmingPool swimmingPool;
    private Garden garden;

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

    public HouseBuilder windows(int windows) {
        this.windows = windows;
        return this;
    }

    public HouseBuilder doors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder rooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder garage(Garage garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder swimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    public HouseBuilder garden(Garden garden) {
        this.garden = garden;
        return this;
    }

    public House build() {
        return new House(this);
    }
    
}
