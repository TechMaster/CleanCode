package builder.after2;

import builder.model.Garage;
import builder.model.Garden;
import builder.model.SwimmingPool;
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
