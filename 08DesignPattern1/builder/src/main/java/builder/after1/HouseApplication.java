package builder.after1;

import builder.model.Garage;
import builder.model.Garden;
import builder.model.SwimmingPool;

public class HouseApplication {

    public static void main(String[] args) {
        House simpleHouse = new House.HouseBuilder()
                .windows(2)
                .doors(1)
                .rooms(1)
                .build();

        House advancedHouse = new House.HouseBuilder()
                .windows(4)
                .doors(2)
                .rooms(3)
                .garage(new Garage())
                .swimmingPool(new SwimmingPool())
                .garden(new Garden())
                .build();
    }
}
