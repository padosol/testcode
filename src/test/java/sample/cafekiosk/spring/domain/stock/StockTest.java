package sample.cafekiosk.spring.domain.stock;

import org.junit.jupiter.api.*;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    
    private static final Stock stock = Stock.create("001", 1);
    
    @DisplayName("재고의 수량이 제공된 수량보다 작은지 확인한다.")
    @Test
    void isQuantityLessThenEx() {
        // given
        int quantity= 2;
        // when
        boolean result = stock.isQuantityLessThan(quantity);

        // then
        assertThat(result).isTrue();
    }



    @DisplayName("")
    @Disabled
    @TestFactory
    Collection<DynamicTest> dynamicTest() {
        return List.of(
                DynamicTest.dynamicTest("", () -> {

                }),
                DynamicTest.dynamicTest("", () -> {

                })
        );
    }
    
    
    
    @DisplayName("재고 차감 시나리오")
    @TestFactory
    Collection<DynamicTest> stockDeductionDynamicTest() {
        // given
        Stock stock = Stock.create("001", 1);

        return List.of(
                DynamicTest.dynamicTest("재고를 주어진 개수만큼 차감할 수 있다.", () -> {
                    // given
                    int quantity = 1;

                    // when
                    stock.deductQuantity(quantity);

                    // then
                    assertThat(stock.getQuantity()).isZero();

                }),
                DynamicTest.dynamicTest("재고보다 많은 수의 수량으로 차감 시도하는 경우 예외가 발생한다.", () -> {
                    // given
                    int quantity = 1;

                    // when & then
                    assertThatThrownBy(() -> stock.deductQuantity(quantity))
                            .isInstanceOf(IllegalArgumentException.class)
                            .hasMessage("차감할 재고 수량이 없습니다.");

                })
        );
    }


}