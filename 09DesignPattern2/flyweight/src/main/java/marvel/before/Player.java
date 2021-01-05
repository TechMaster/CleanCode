package marvel.before;

public class Player {

    // Được dùng để phân biệt người chơi
    private int id;

    // Tên của nhân vật
    private String name;

    // Một đối tượng tiêu tốn kha khá bộ nhớ, được dùng để vẽ hình ảnh của nhân vật lên giao diện
    private Graph graph;

    // Tọa độ của nhân vật
    private int x;
    private int y;

    public Player(int id, String name, Graph graph, int x, int y) {
        this.id = id;
        this.name = name;
        this.graph = graph;
        this.x = x;
        this.y = y;
        System.out.printf("Create player %s at position (%d, %d)%n", name, x, y);
    }

}
