package inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Flyweight factory
 */
public class ProductFactory {

    private final Map<Integer, Product> cache = new HashMap<>();

    public Product getProduct(Integer id) {
        Product product = cache.get(id);
        if (product != null) {
            return product;
        }
        return queryProduct(id);
    }

    private Product queryProduct(Integer id) {
        Product product = mock(id);
        cache.put(id, product);
        System.out.printf("Loaded %s\n", product.getName());
        return product;
    }

    private Product mock(Integer id) {
        Product product = new Product();
        product.setId(id);
        product.setName("product #" + id);
        product.setPrice(ThreadLocalRandom.current().nextInt(1000));
        return product;
    }

}
