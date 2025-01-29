package com.example.shopee_s29986;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ShopServiceTest {

    @Mock
    private Cart cart;

    @Mock
    private ShopStorage shopStorage;

    @InjectMocks
    private ShopService shopService;

    @Test
    void shouldOrderItems() {
        //GIVEN
        Customer customer = new Customer(1, 30);
        when(cart.getProducts()).thenReturn(Arrays.asList("cheese", "beer"));
        when(shopStorage.getProduct("cheese")).thenReturn(new Product("cheese", 16.0));
        when(shopStorage.getProduct("beer")).thenReturn(new Product("beer", 9.0));
        when(cart.getCustomer()).thenReturn(customer);

        //WHEN
        Status result = shopService.orderItems(cart);

        //THEN
        assertThat(result).isEqualTo(Status.ACCEPTED);
    }
}
