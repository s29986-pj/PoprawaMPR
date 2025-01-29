package com.example.shopee_s29986;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ShopStorageTest {

    @InjectMocks
    private ShopStorage shopStorage;

    @Test
    void shouldGetProduct() {
        // GIVEN
        String item1 = "beer";
        String item2 = "yoyo";

        // WHEN
        Product product1 = shopStorage.getProduct(item1);
        Product product2 = shopStorage.getProduct(item2);

        // THEN
        assertThat(product1).isNotNull();
        assertThat(product1.getPrice()).isEqualTo(9.0);
        assertThat(product2).isNull();
    }

}
