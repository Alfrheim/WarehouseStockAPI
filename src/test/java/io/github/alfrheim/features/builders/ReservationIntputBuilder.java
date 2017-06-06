package io.github.alfrheim.features.builders;

import io.github.alfrheim.dto.in.Item;
import io.github.alfrheim.dto.in.ReservationInput;
import io.github.alfrheim.features.ShoppingFeature;

import java.util.Arrays;

/**
 * @author alfrheim on 06/06/17.
 */
public class ReservationIntputBuilder {

    private ReservationInput reservationInput;

    private ReservationIntputBuilder() {
        this.reservationInput = new ReservationInput();
        reservationInput.setItems(Arrays.asList());
    }

    public static ReservationIntputBuilder aReservation() {
        return new ReservationIntputBuilder();
    }

    public ReservationIntputBuilder with(Item item) {
        this.reservationInput.getItems().add(item);
        return this;
    }

    public ReservationInput build() {
        return this.reservationInput;
    }
}
