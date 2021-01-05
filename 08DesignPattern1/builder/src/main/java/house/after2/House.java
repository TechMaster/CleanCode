package house.after2;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class House {

    private int windows;

    private int doors;

    private int rooms;

    private Garage garage;

    private SwimmingPool swimmingPool;

    private Garden garden;

}
