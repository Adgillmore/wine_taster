package com.amorphic.atg.taster.review.common;

import com.amorphic.atg.taster.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adam on 20/06/16.
 */
public class AbstractCharacteristics implements Characteristics {

    private final List<String> mAromas;

    public AbstractCharacteristics() {
        mAromas = new ArrayList<>();
    }

    @Override
    public void addCharacteristic(final String aroma) {
        InputUtils.checkString(aroma);
        mAromas.add(aroma);
    }

    @Override
    public void addAllCharacteristics(final String... aromas) {
        if (aromas == null || aromas.length == 0) throw new IllegalArgumentException(
                "Aromas cannot be null or empty");
        for (int i = 0; i < aromas.length; i++) {
            final String aroma = aromas[i];
            InputUtils.checkString(aroma);
            mAromas.add(aroma);
        }
    }

    @Override
    public List<String> getCharacteristics() {
        return mAromas;
    }
}
