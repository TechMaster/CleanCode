package inventory;

import marvel.after.Hero;
import marvel.after.HeroFactory;
import marvel.after.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Client
 */
public class InventoryApplication {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product product = productFactory.getProduct(1);
        new PurchaseRequest(product, 10);

        product = productFactory.getProduct(2);
        new PurchaseRequest(product, 6);

        product = productFactory.getProduct(1);
        new PurchaseRequest(product, 2);

        product = productFactory.getProduct(1);
        new PurchaseRequest(product, 5);

        product = productFactory.getProduct(2);
        new PurchaseRequest(product, 9);
    }

}
