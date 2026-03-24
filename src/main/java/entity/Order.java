package eshop.entity;

public class Order {
    private final DeliveryType type;
    private final ProductName name;
    private int deliveryTime;

    public Order(ProductName name, DeliveryType type) {
        this.name = name;
        this.type = type;
        calculateDeliveryTime();
        factory();
    }

    private void calculateDeliveryTime(){
        switch (type) {
            case STANDARD -> deliveryTime = 5;
            case EXPRESS -> deliveryTime = 2;
            case PICKUP -> deliveryTime = 0;
        }
    }

    private void factory(){
        switch (name) {
            case BOOK -> new Book();
            case ELECTRONIC -> new Electronic();
            case CLOTHING -> new Clothing();
        }
    }

    @Override
    public String toString() {
        return "Product: " + name +
                ", Delivery: " + type +
                ", Delivery time: " + deliveryTime +
                " days";
    }
}
