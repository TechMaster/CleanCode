package marvel.after;

import java.util.Random;

/**
 * Client
 */
public class MarvelApplication {

    private static final Random RANDOM = new Random();
    private static final String[] HERO_NAMES = {"Superman", "Hulk", "Thor"};

    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        for (int i = 1; i <= 5; i++) {
            Player player = new Player();
            String heroName = HERO_NAMES[RANDOM.nextInt(HERO_NAMES.length)];
            Hero hero = heroFactory.getHero(heroName);
            player.join(hero);
            player.move(RANDOM.nextInt(100), RANDOM.nextInt(100));
        }
    }

}
