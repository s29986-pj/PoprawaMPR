package com.example.shopee_s29986;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopStorageTestIT {

    @Autowired
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