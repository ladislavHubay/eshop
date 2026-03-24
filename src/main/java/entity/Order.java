package entity;

import service.ProductFactory;

public class Order {
    private final DeliveryType type;
    private final Product product;

    public Order(ProductName name, DeliveryType type) {
        this.type = type;
        this.product = ProductFactory.create(name);
    }

    private int getDeliveryTime(){
        return switch (type) {
            case STANDARD -> 5;
            case EXPRESS -> 2;
            case PICKUP -> 0;
        };
    }

    @Override
    public String toString() {
        return "Product: " + product.getName() +
                ", Delivery: " + type +
                ", Delivery time: " + getDeliveryTime() +
                " days";
    }
}
