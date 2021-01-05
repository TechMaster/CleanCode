package marvel.before;

import java.util.Random;

public class MarvelApplication {

    private static final Random RANDOM = new Random();
    private static final String[] HERO_NAMES = {"Superman", "Hulk", "Thor"};

    public static void main(String[] args) {
        // Join game
        new Player(1, HERO_NAMES[0], new Graph(), RANDOM.nextInt(100), RANDOM.nextInt(100));

        // Move
        new Player(1, HERO_NAMES[0], new Graph(), RANDOM.nextInt(100), RANDOM.nextInt(100));
        new Player(1, HERO_NAMES[0], new Graph(), RANDOM.nextInt(100), RANDOM.nextInt(100));
        new Player(1, HERO_NAMES[0], new Graph(), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

}
