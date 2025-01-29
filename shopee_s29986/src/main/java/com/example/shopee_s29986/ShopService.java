package com.example.shopee_s29986;

import org.springframework.stereotype.Component;

@Component
public class ShopService {
    private ShopStorage shopStorage;

    public ShopService(ShopStorage shopStorage) {
        this.shopStorage = shopStorage;
    }

    public Status orderItems(Cart cart) {
        double total = 0;
        for (String productName : cart.getProducts()) {
            Product item = shopStorage.getProduct(productName);
            if (item != null) {
                total += item.getPrice();
            }
        }

        Customer customer = cart.getCustomer();
        double balance = customer.getBalance();
        if (balance >= total) {
            customer.setBalance(balance - total);
            System.out.println("Total: " + total + ". Customer balance after purchase: " + customer.getBalance());
            return Status.ACCEPTED;
        } else {
            System.out.println("Total: " + total + ". Purchase failed. Customer is too poor: " + customer.getBalance());
            return Status.DECLINED;
        }
    }
}
