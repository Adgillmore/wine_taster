package com.amorphic.atg.taster;

import com.amorphic.atg.taster.wine.Wine;
import com.amorphic.atg.taster.wine.WineBuilder;
import com.amorphic.atg.taster.wine.WineBuilderImpl;

import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by adam on 12/06/16.
 */
public class WineBuilderImplTest {

    @Test
    public void createTest() {
        final WineBuilder builder = new WineBuilderImpl();
        builder.name("Imperial Reserva")
                .producer("CVNE")
                .country("Spain")
                .region("Rioja")
                .grape("Tempranillo", 1)
                .alcohol(14.0f)
                .price(20.00f)
                .vintage(2009)
                .supplier("The Wine Society");

        final Wine wine = builder.build();

        assertNotNull(wine);
        assertEquals("Imperial Reserva", wine.getName());
        assertEquals("CVNE", wine.getProducer());
        assertEquals("Spain", wine.getCountry());
        assertEquals("Rioja", wine.getRegion());
        assertTrue(wine.getGrapes().containsKey("Tempranillo"));
        assertEquals("1.0f", wine.getGrapes().get("Tempranillo"));

    }
}
