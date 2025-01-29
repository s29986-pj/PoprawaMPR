package com.example.shopee_s29986;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Customer customer;
    private List<String> cartProducts;

    public Cart(Customer customer) {
        this.customer = customer;
        this.cartProducts = new ArrayList<>();
    }

    public void addItemToCart(String productName) {
        cartProducts.add(productName);
    }

    public List<String> getProducts() {
        return cartProducts;
    }

    public Customer getCustomer() {
        return customer;
    }
}
