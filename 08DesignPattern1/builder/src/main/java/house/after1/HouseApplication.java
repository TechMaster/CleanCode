package house.after1;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

/**
 * Solution 1 - Create builder class into product class
 */
public class HouseApplication {

    public static void main(String[] args) {
        House simpleHouse = new House.HouseBuilder()
                .windows(2)
                .doors(1)
                .rooms(1)
                .build();
        System.out.println(simpleHouse);

        House advancedHouse = new House.HouseBuilder()
                .windows(4)
                .doors(2)
                .rooms(3)
                .garage(new Garage())
                .swimmingPool(new SwimmingPool())
                .garden(new Garden())
                .build();
        System.out.println(advancedHouse);
    }

}
