package sample.cafekiosk.spring.api.service.order.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateServiceRequest {
    private List<String> productNumbers;
}
