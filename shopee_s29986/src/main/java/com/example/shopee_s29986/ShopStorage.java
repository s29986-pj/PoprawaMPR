package com.example.shopee_s29986;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShopStorage {
    private Map<String, Product> products;

    public ShopStorage() {
        products = new HashMap<String, Product>();
        products.put("milk", new Product("milk", 5.0));
        products.put("beer", new Product("beer", 9.0));
        products.put("butter", new Product("butter", 8.0));
        products.put("cheese", new Product("cheese", 16.0));
        products.put("WD-40", new Product("WD-40", 40.0));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
}
