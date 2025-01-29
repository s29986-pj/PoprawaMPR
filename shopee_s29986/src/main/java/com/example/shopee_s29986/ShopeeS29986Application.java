package com.example.shopee_s29986;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS29986Application {

	public ShopeeS29986Application(ShopService shopService) {
		Customer customer = new Customer(1, 50);
		Cart cart = new Cart(customer);
		cart.addItemToCart("milk");
		cart.addItemToCart("milk");
		cart.addItemToCart("deer");
		cart.addItemToCart("WD-40");
		shopService.orderItems(cart);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS29986Application.class, args);
	}

}
