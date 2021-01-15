package house.after2;

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

    private House(Builder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.garage = builder.garage;
        this.swimmingPool = builder.swimmingPool;
        this.garden = builder.garden;
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

    public static class Builder {

        private int windows;
        private int doors;
        private int rooms;
        private Garage garage;
        private SwimmingPool swimmingPool;
        private Garden garden;

        public Builder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder garage(Garage garage) {
            this.garage = garage;
            return this;
        }

        public Builder swimmingPool(SwimmingPool swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public Builder garden(Garden garden) {
            this.garden = garden;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

}
