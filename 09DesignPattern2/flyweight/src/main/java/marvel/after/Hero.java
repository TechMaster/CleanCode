package marvel.after;

/**
 * Flyweight
 */
public class Hero {

    // Intrinsic data
    private String heroName;
    private Graph graph;

    public Hero(String heroName) {
        this.heroName = heroName;
        this.graph = new Graph();
    }

    public String getHeroName() {
        return heroName;
    }

    public static class Graph {
    }

}
