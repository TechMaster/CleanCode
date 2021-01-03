package builder.before1;

import builder.model.Garage;

public class HouseWithGarage extends House {

    private Garage garage;

    public HouseWithGarage(int windows, int doors, int rooms, Garage garage) {
        super(windows, doors, rooms);
        this.garage = garage;
    }
}
