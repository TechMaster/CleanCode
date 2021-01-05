package house.before1;

import lombok.Data;

@Data
public class House {

    private int windows;

    private int doors;

    private int rooms;

    public House(int windows, int doors, int rooms) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
    }

}
