package inventory;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Context
 */
@Data
public class PurchaseRequest {

    // Flyweight
    private Product product;

    // Extrinsic data
    private Integer quantity;

    public PurchaseRequest(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        System.out.printf("Purchasing %d %s%n", quantity, product.getName());
    }

}
