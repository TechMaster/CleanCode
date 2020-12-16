package orderafter;

import java.util.List;

import orderbefore.OrderItem;


public class Order {
  String shipToCountry;
  List<OrderItem> orderItems;
  ITaxCalculator taxCalculator = new TaxCalculator();

  public Order (List<OrderItem> orderItems, String shipToCountry) {
    this.shipToCountry = shipToCountry;
    this.orderItems = orderItems;
  }
  public float getOrderTotal() {
    float total = 0;
    for (OrderItem item: orderItems) {
      total += item.quantity * item.unitPrice;
    }
    total = taxCalculator.caculateTax(total, shipToCountry);    
    return total;
  }


}
