package laet.btgpactual.orderms.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String produto,
                             String quantidade,
                             BigDecimal preco) {
}
