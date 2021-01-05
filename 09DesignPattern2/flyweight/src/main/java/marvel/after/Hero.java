package marvel.after;

public class Hero {

    // Intrinsic data
    private String name;
    private Graph graph;

    public Hero(String name) {
        this.name = name;
        this.graph = new Graph();
    }

    public String getName() {
        return name;
    }

}
