package house.after1;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

public class House {

    private int windows;
    private int doors;
    private int rooms;
    private Garage garage;
    private SwimmingPool swimmingPool;
    private Garden garden;

    private House() {
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

    public static class HouseBuilder {

        private int windows;
        private int doors;
        private int rooms;
        private Garage garage;
        private SwimmingPool swimmingPool;
        private Garden garden;

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
            House house = new House();
            house.windows = this.windows;
            house.doors = this.doors;
            house.rooms = this.rooms;
            house.garage = this.garage;
            house.swimmingPool = this.swimmingPool;
            house.garden = this.garden;
            return house;
        }

    }

}
