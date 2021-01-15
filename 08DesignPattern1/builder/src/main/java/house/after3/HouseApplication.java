package house.after3;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

/**
 * Solution 3 - Use @Builder of Lombok
 */
public class HouseApplication {

    public static void main(String[] args) {
        House simpleHouse = House
                .builder()
                .windows(2)
                .doors(1)
                .rooms(1)
                .build();
        System.out.println(simpleHouse);

        House advancedHouse = House
                .builder()
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
