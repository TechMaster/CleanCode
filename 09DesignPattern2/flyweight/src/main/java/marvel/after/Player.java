package marvel.after;

public class Player {

    private int id;

    private Hero hero;

    // Extrinsic data
    private int x;
    private int y;

    public Player(int id) {
        this.id = id;
    }

    public void join(Hero hero) {
        this.hero = hero;
        System.out.printf("%s joined game%n", hero.getName());
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("%s is moving to (%d, %d)%n", hero.getName(), x, y);
    }

}