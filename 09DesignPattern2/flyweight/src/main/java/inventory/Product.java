package inventory;

import lombok.Data;

/**
 * Flyweight
 */
@Data
public class Product {

    // Intrinsic data

    private Integer id;

    private String name;

    private Integer price;

}
