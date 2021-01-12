package marvel.before;

import java.util.Random;

public class MarvelApplication {

    private static final Random RANDOM = new Random();
    private static final String[] HERO_NAMES = {"Superman", "Hulk", "Thor"};

    public static void main(String[] args) {
        // Join game
        new Player(HERO_NAMES[0], RANDOM.nextInt(100), RANDOM.nextInt(100));

        // Move
        new Player(HERO_NAMES[0], RANDOM.nextInt(100), RANDOM.nextInt(100));
        new Player(HERO_NAMES[0], RANDOM.nextInt(100), RANDOM.nextInt(100));
        new Player(HERO_NAMES[0], RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

}
