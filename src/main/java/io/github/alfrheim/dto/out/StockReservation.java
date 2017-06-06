package io.github.alfrheim.dto.out;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alfrheim on 06/06/17.
 */
public class StockReservation {
    private String reservationId;
    private List<Reservation> reservations = new ArrayList<>();

    public String Id() {
        return this.reservationId;
    }

    public int reservedItems() {
        return reservations.size();
    }

}
