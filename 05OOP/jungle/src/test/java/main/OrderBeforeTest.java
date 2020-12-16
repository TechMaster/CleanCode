package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import orderbefore.Order;
import orderbefore.OrderItem;


public class OrderBeforeTest {
    
    @Test
    @DisplayName("Kiểm tra hàm GetOrderTotal")
    public void testGetOrderTotal()
    {
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("Logitech Mouse", 24, 1));
        

        String shipToCountry = "EU";
        Order myOrder = new Order(orderItems, shipToCountry);
        assertEquals(24 * (1 + 0.2), myOrder.getOrderTotal(), 0.0001);
    }
}
