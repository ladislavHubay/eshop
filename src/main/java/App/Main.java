package eshop.app;

import eshop.entity.DeliveryType;
import eshop.entity.Order;
import eshop.entity.ProductName;
import eshop.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(ProductName.BOOK, DeliveryType.STANDARD));
        orders.add(new Order(ProductName.ELECTRONIC, DeliveryType.EXPRESS));
        orders.add(new Order(ProductName.CLOTHING, DeliveryType.PICKUP));

        OrderService orderService = new OrderService(orders);
        orderService.output();
    }
}
