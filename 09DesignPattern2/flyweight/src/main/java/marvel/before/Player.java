package marvel.before;

public class Player {

    // Tên của nhân vật
    private String heroName;

    // Một đối tượng tiêu tốn kha khá bộ nhớ, được dùng để vẽ hình ảnh của nhân vật lên giao diện
    private Graph graph;

    // Tọa độ của nhân vật
    private int x;
    private int y;

    public Player(String heroName, int x, int y) {
        this.heroName = heroName;
        this.graph = new Graph();
        this.x = x;
        this.y = y;
        System.out.printf("Create player %s at position (%d, %d)%n", heroName, x, y);
    }

    public static class Graph {
    }

}
