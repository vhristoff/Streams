package org.infinite.tap.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String name;
    private final Category category;
    private final double price;

    public Product(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }


    public static List<Product> getAll() {
        return new ArrayList<>();
    }
}

