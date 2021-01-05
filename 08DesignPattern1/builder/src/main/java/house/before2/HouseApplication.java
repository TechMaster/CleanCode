package house.before2;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

/**
 * Idea 2 - Create all arguments constructors
 */
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
