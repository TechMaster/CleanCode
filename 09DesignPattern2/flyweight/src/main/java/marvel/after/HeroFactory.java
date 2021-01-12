package marvel.after;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight factory
 */
public class HeroFactory {

    private final Map<String, Hero> cache = new HashMap<>();

    public Hero getHero(String heroName) {
        Hero hero = cache.get(heroName);
        if (hero != null) {
            return hero;
        }
        return createHero(heroName);
    }

    private Hero createHero(String heroName) {
        Hero hero = new Hero(heroName);
        cache.put(heroName, hero);
        System.out.printf("%s was created\n", heroName);
        return hero;
    }

}
