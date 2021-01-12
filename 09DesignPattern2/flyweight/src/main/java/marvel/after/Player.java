package marvel.after;

/**
 * Context
 */
public class Player {

    // Flyweight
    private Hero hero;

    // Extrinsic data
    private int x;
    private int y;

    public void join(Hero hero) {
        this.hero = hero;
        System.out.printf("%s joined game%n", hero.getHeroName());
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("%s is moving to (%d, %d)%n", hero.getHeroName(), x, y);
    }

}
