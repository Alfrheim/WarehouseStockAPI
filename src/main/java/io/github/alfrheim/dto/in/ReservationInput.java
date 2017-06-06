package io.github.alfrheim.dto.in;

import java.util.List;

/**
 * @author alfrheim on 06/06/17.
 */
public class ReservationInput {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
