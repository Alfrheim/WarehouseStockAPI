package io.github.alfrheim.features;

import io.github.alfrheim.dto.in.Item;
import io.github.alfrheim.dto.in.ReservationInput;
import io.github.alfrheim.dto.out.StockReservation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static io.github.alfrheim.features.builders.ItemBuilder.*;
import static io.github.alfrheim.features.builders.ReservationIntputBuilder.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpMethod.*;
import static org.springframework.http.HttpStatus.OK;

/**
 * @author alfrheim on 06/06/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
public class ShoppingFeature {

    private static final String RESERVATION_URL = "/stock/v2/reservation/{reservationId}";
    private static final Item SHOES = anItem().withVariantId(12).withQuantity(1).build();

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void add_items_to_the_reservation() throws Exception {
        Map<String, Integer> inputs = new HashMap<>();
        inputs.put("reservationId", 123);

        HttpEntity<ReservationInput> request = new HttpEntity<>(aReservation().with(SHOES).build());

        ResponseEntity<StockReservation> response = this.restTemplate.exchange(RESERVATION_URL, PATCH, request, StockReservation.class, inputs);

        assertThat(response.getStatusCode())
                .isEqualTo(OK);
        assertThat(response.getBody().Id())
                .isEqualTo("123");
        assertThat(response.getBody().reservedItems())
                .isEqualTo(2);

    }

}
