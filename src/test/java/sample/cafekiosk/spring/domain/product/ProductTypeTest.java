package sample.cafekiosk.spring.domain.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductTypeTest {
    @DisplayName("상품 타입이 재고 관련 타입인지 체크 한다.")
    @Test
    void containsStockType1() {
        // given
        ProductType givenType = ProductType.HANDMADE;
        
        // when
        boolean result = ProductType.containsStockType(givenType);
        
        // then
        assertThat(result).isFalse();
    }

    @DisplayName("상품 타입이 재고 관련 타입인지 체크 한다.")
    @Test
    void containsStockType2() {
        // given
        ProductType givenType = ProductType.BOTTLE;

        // when
        boolean result = ProductType.containsStockType(givenType);

        // then
        assertThat(result).isTrue();
    }
}