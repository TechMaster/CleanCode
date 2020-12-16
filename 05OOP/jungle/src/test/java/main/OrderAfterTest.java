package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import orderafter.Order;
import orderbefore.OrderItem;

public class OrderAfterTest {
  @Test
    @DisplayName("Kiểm tra hàm GetOrderTotal sau khi refactor")
    public void testGetOrderTotal()
    {
      ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("Logitech Mouse", 24, 1));
        

        String shipToCountry = "EU";
        Order myOrder = new Order(orderItems, shipToCountry);
        assertEquals(24 * (1 + 0.2), myOrder.getOrderTotal(), 0.0001);
    }
  
}
