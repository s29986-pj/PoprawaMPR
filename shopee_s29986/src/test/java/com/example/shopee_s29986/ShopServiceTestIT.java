package com.example.shopee_s29986;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopServiceTestIT {

    @Autowired
    private ShopStorage shopStorage;

    @Autowired
    private ShopService shopService;

    @Test
    void shouldOrderItems() {
        //GIVEN
        Customer customer = new Customer(1, 50);
        Cart cart = new Cart(customer);
        cart.addItemToCart("milk");
        cart.addItemToCart("deer");
        cart.addItemToCart("WD-40");

        //WHEN
        Status result = shopService.orderItems(cart);

        //THEN
        assertThat(result).isEqualTo(Status.ACCEPTED);
    }
}