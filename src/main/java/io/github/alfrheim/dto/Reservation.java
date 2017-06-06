package io.github.alfrheim.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alfrheim on 06/06/17.
 */
public class Reservation {
    private String reservationId;
    private List<Item> items = new ArrayList<>();

    public String Id() {
        return this.reservationId;
    }

    public int reservedItems() {
        return items.size();
    }

}
