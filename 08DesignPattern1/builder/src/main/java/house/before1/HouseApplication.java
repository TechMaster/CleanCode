package house.before1;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

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
