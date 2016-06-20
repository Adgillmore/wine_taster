package com.amorphic.atg.taster.review.common;

import java.util.List;

/**
 * Created by adam on 20/06/16.
 */
public interface Characteristics {

    void addCharacteristic(String aroma);
    void addAllCharacteristics(String... aromas);
    List<String> getCharacteristics();
}
