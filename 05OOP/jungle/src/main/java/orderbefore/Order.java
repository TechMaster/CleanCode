package orderbefore;

import java.util.List;

public class Order {
  String shipToCountry;
  List<OrderItem> orderItems;
  
  public Order (List<OrderItem> orderItems, String shipToCountry) {
    this.shipToCountry = shipToCountry;
    this.orderItems = orderItems;
  }
  public float getOrderTotal() {
    float total = 0;
    for (OrderItem item: orderItems) {
      total += item.quantity * item.unitPrice;
    }

    if (shipToCountry.equals("US")) {
      total += total * 0.07; //US sales tax
    } else if (shipToCountry.equals("EU")) {
      total += total * 0.2;  //EU VAT
    }
    return total;
  }
}


