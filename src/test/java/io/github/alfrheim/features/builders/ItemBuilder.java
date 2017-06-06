package io.github.alfrheim.features.builders;

import io.github.alfrheim.dto.in.Item;
import io.github.alfrheim.features.ShoppingFeature;

/**
 * @author alfrheim on 06/06/17.
 */
public class ItemBuilder {

    private Item item;

    private ItemBuilder() {
        this.item = new Item();
    }

    public static ItemBuilder anItem() {
        return new ItemBuilder();
    }

    public ItemBuilder withVariantId(int id) {
        this.item.setVariantId(id);
        return this;
    }

    public ItemBuilder withQuantity(int quantity) {
        this.item.setQuantity(quantity);
        return this;
    }

    public Item build() {
        return this.item;
    }
}
