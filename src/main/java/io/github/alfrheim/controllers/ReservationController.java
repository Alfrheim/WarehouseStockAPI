package io.github.alfrheim.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.PATCH;

/**
 * @author alfrheim on 06/06/17.
 */
@RestController("/stock/v2/reservation/{reservation_id}")
public class ReservationController {

    @RequestMapping(method = PATCH)
    public ReponseEntity<Reservation> addItemReservation( @PathVariable("reservation_id") String reservationId) {

    }
}
