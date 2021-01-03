package builder.before2;

import builder.model.Garage;
import builder.model.Garden;
import builder.model.SwimmingPool;

public class HouseApplication {

    public static void main(String[] args) {
        // Simple house
        House simpleHouse = new House(2, 1, 1, null, null, null);

        // House with garage
        House houseWithGarage = new House(2, 1, 1, new Garage(), null, null);

        // House with swimming pool
        House houseWithSwimmingPool = new House(2, 1, 1, null, new SwimmingPool(), null);

        // House with garage
        House houseWithGarden = new House(2, 1, 1, null, null, new Garden());
    }
}
