package entity;

import factory.ProductFactory;

public class Order {
    private final DeliveryType type;
    private final Product product;

    public Order(ProductName name, DeliveryType type) {
        this.type = type;
        this.product = ProductFactory.create(name);
    }

    public int getDeliveryTime() {
        return type.getDeliveryTime();
    }

    @Override
    public String toString() {
        return "Product: " + product.getName() +
                ", Delivery: " + type +
                ", Delivery time: " + getDeliveryTime() +
                " days";
    }
}
