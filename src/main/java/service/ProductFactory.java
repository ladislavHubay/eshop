package service;

import entity.*;

public class ProductFactory {
    public static Product create(ProductName name){
        return switch (name) {
            case BOOK -> new Book();
            case ELECTRONIC -> new Electronic();
            case CLOTHING -> new Clothing();
        };
    }
}
