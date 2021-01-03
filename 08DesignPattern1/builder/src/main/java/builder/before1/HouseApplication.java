package builder.before1;

import builder.model.Garage;
import builder.model.Garden;
import builder.model.SwimmingPool;

public class HouseApplication {

    public static void main(String[] args) {
        // Simple house
        House simpleHouse = new House(2, 1, 1);

        // House with garage
        HouseWithGarage houseWithGarage = new HouseWithGarage(2, 1, 1, new Garage());

        // House with swimming pool
        HouseWithSwimmingPool houseWithSwimmingPool = new HouseWithSwimmingPool(2, 1, 1, new SwimmingPool());

        // House with garage
        HouseWithGarden houseWithGarden = new HouseWithGarden(2, 1, 1, new Garden());
    }
}
