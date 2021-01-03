package house.before3;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

public class HouseApplication {

    public static void main(String[] args) {
        // Simple house
        House simpleHouse = new House(2, 1, 1);

        // House with garage
        House houseWithGarage = new House(2, 1, 1, new Garage());

        // House with swimming pool
        House houseWithSwimmingPool = new House(2, 1, 1, new SwimmingPool());

        // House with garage
        House houseWithGarden = new House(2, 1, 1, new Garden());
    }
}
