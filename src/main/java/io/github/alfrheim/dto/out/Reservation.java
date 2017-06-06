package io.github.alfrheim.dto.out;

import java.time.LocalDateTime;

/**
 * @author alfrheim on 06/06/17.
 */
public class Reservation {
    private Long variantId;
    private Short quantityReserved;
    private LocalDateTime expiryDateTime;
    private String reason;

    public Reservation(Long variantId, Short quantityReserved, LocalDateTime expiryDateTime, String reason) {
        this.variantId = variantId;
        this.quantityReserved = quantityReserved;
        this.expiryDateTime = expiryDateTime;
        this.reason = reason;
    }
}
