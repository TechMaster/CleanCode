package house.before1;

import house.model.Garage;

public class HouseWithGarage extends House {

    private Garage garage;

    public HouseWithGarage(int windows, int doors, int rooms, Garage garage) {
        super(windows, doors, rooms);
        this.garage = garage;
    }
}
