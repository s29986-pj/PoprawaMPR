package com.example.shopee_s29986;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CartTest {

    @Mock
    private Customer customer;

    @InjectMocks
    private Cart cart;

    @Test
    void shouldAddItemToCart() {
        //GIVEN
        String item = "milk";

        //WHEN
        cart.addItemToCart(item);

        //THEN
        assertThat(cart.getProducts()).isNotEmpty();
        assertThat(cart.getProducts()).contains(item);
    }

    @Test
    void shouldGetCustomer() {
        //WHEN
        Customer result = cart.getCustomer();

        //THEN
        assertThat(result).isEqualTo(customer);
    }

}
