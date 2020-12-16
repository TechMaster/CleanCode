package orderbefore;

public class OrderItem {
  public String name;
  public int unitPrice;
  public int quantity; 
  public OrderItem(String name, int unitPrice, int quantity) {
    this.name = name;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  } 
}