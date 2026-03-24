package eshop.service;

import eshop.entity.Order;

import java.util.List;

public class OrderService {
    private final List<Order> list;

    public OrderService(List<Order> list) {
        this.list = list;
    }

    public void output() {
        for (Order order : list) {
            System.out.println(order.toString());
        }
    }
}
