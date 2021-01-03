package marvel;

import java.util.HashMap;
import java.util.Map;

public class HeroFactory {

    private final Map<String, Hero> cache = new HashMap<>();

    public Hero getHero(String name) {
        Hero hero = cache.get(name);
        if (hero != null) {
            return hero;
        }
        return createHero(name);
    }

    private Hero createHero(String name) {
        Hero hero = new Hero(name);
        cache.put(name, hero);
        System.out.printf("%s was created\n", name);
        return hero;
    }
}
