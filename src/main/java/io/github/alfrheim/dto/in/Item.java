package io.github.alfrheim.dto.in;

/**
 * @author alfrheim on 06/06/17.
 */
public class Item {
    private Integer variantId;
    private Integer quantity;
    private Integer requestedExpiry;

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRequestedExpiry() {
        return requestedExpiry;
    }

    public void setRequestedExpiry(Integer requestedExpiry) {
        this.requestedExpiry = requestedExpiry;
    }
}
