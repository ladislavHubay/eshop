package entity;

public enum DeliveryType {
    STANDARD(5),
    EXPRESS(2),
    PICKUP(0);

    private final int days;

    DeliveryType(int days) {
        this.days = days;
    }

    public int getDeliveryTime() {
        return days;
    }
}
